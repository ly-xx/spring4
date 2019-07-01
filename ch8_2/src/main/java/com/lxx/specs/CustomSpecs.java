package com.lxx.specs;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.SingularAttribute;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义repository实现
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/28 14:03
 * @since JDK 1.8
 */
public class CustomSpecs {

    /**
     * 自动匹配实体参数查询（String类型字段模糊查询，其余类型精确查询）
     *
     * @param entityManager 实体管理器
     * @param example       实体类型
     * @param <T>           泛型
     * @return 对应实体接口查询规范
     */
    public static <T> Specification<T> byAuto(final EntityManager entityManager, final T example) {
        // 获取当前实体对象类型
        final Class<T> tClass = (Class<T>) example.getClass();
        // 新建列表存储查询条件
        return new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<>();
                // 获取实体的entityType,可通过entityType获取实体类的属性
                EntityType<T> entity = entityManager.getMetamodel().entity(tClass);

                // 对实体的所有属性循环
                for (Attribute<T, ?> attr : entity.getDeclaredAttributes()) {
                    // 获取某个属性值
                    Object attrValue = getValue(example, attr);
                    if (null != attrValue) {
                        if (attr.getJavaType() == String.class) {
                            if (!StringUtils.isEmpty(attrValue)) {
                                list.add(criteriaBuilder.like(
                                        root.get(attribute(entity, attr.getName(), String.class)),
                                        pattern((String) attrValue)));
                            } else {
                                list.add(criteriaBuilder.equal(
                                        root.get(attribute(entity, attr.getName(), attrValue.getClass())),
                                        attrValue));
                            }
                        }
                    }
                }
                return list.isEmpty() ? criteriaBuilder.conjunction() :
                        criteriaBuilder.and(list.toArray(new Predicate[list.size()]));
            }
        };
    }

    /**
     * 通过反射获取属性值
     *
     * @param example 实体
     * @param attr    属性
     * @param <T>     泛型
     * @return 实体对应属性值
     */
    private static <T> Object getValue(T example, Attribute<T, ?> attr) {
        return ReflectionUtils.getField((Field) attr.getJavaMember(), example);
    }

    /**
     * 获取实体类当前属性的SingularAttribute， SingularAttribute是包含了实体类的某个单独属性
     *
     * @param entity     实体类型
     * @param fieldName  字段名称
     * @param fieldClass 字段类型
     * @param <E>        泛型
     * @param <T>        泛型
     * @return 获取实体某个属性
     */
    private static <E, T> SingularAttribute<T, E> attribute(EntityType<T> entity, String fieldName, Class<E> fieldClass) {
        return entity.getDeclaredSingularAttribute(fieldName, fieldClass);
    }

    /**
     * 模糊匹配字符串
     *
     * @param str 字符串
     * @return 模糊匹配
     */
    private static String pattern(String str) {
        return "%" + str + "%";
    }
}
