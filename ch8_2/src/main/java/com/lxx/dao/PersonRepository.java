package com.lxx.dao;

import com.lxx.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 接口类
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/27 17:40
 * @since JDK 1.8
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByAddress(String address);

    @Query("select p from Person p where p.name = :name")
    Person withNameQuery(@Param(value = "name") String name);

    List<Person> withNameAndAddressNameQuery(String name, String address);
}
