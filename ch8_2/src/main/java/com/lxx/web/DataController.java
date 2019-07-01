package com.lxx.web;

import com.lxx.dao.PeopleRepository;
import com.lxx.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/1 15:13
 * @since JDK 1.8
 */
@RestController
public class DataController {

    @Autowired
    private PeopleRepository peopleRepository;

    @RequestMapping(value = "findByAuto")
    public Page<Person> page(Person person) {
        Page<Person> page = peopleRepository.findByAuto(person, PageRequest.of(0, 10));
        return page;
    }
}
