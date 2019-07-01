package com.lxx.support;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * 自定义接口
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/28 14:38
 * @since JDK 1.8
 */
@NoRepositoryBean
public interface CustomRepository<T, ID extends Serializable> extends JpaRepository<T, ID>,
        JpaSpecificationExecutor<T> {

    /**
     * 自动查询
     *
     * @param example  实体信息
     * @param pageable 分页信息
     * @return 分页列表
     */
    Page<T> findByAuto(T example, Pageable pageable);
}
