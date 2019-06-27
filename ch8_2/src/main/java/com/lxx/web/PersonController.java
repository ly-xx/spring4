package com.lxx.web;

import com.lxx.dao.PersonRepository;
import com.lxx.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 控制器
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/27 17:43
 * @since JDK 1.8
 */
@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/save")
    public Person save(String name, String address, Integer age) {
        Person p = personRepository.save(new Person(name, age, address));
        return p;
    }

    @RequestMapping(value = "findByAddress")
    public List<Person> query(String address) {
        return personRepository.findByAddress(address);
    }

    @RequestMapping(value = "nameQuery")
    public List<Person> query(String name, String address) {
        return personRepository.withNameAndAddressNameQuery(name, address);
    }

    @RequestMapping(value = "withNameQuery")
    public Person withNameQuery(String name) {
        return personRepository.withNameQuery(name);
    }

    @RequestMapping(value = "page")
    public Page<Person> page() {
        Page<Person> page = personRepository.findAll(PageRequest.of(0, 10));
        return page;
    }

    @RequestMapping(value = "sort")
    public List<Person> sort() {
        return personRepository.findAll(new Sort(Sort.Direction.DESC, "age"));
    }
}
