package com.lxx.dao;

import com.lxx.domain.Person;
import com.lxx.support.CustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/1 15:12
 * @since JDK 1.8
 */
public interface PeopleRepository extends CustomRepository<Person, Long> {

    List<Person> findByAddress(String address);

    @Query("select p from Person p where p.name = :name")
    Person withNameQuery(@Param(value = "name") String name);

    List<Person> withNameAndAddressNameQuery(String name, String address);
}
