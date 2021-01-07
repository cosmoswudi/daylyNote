package com.geometry.controller;

import com.geometry.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: ProviderController
 * @Author: Zhao Shf
 * @Description:
 * @Date: Create at 16:59 2020/10/21
 * @Iteration:
 **/
@RestController
public class ProviderController {

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable Integer personId, HttpServletRequest request) {
        Person person = new Person();
        person.setId(100);
        person.setAge(20);
        person.setName("xiaohua");
        person.setMessage(request.getRequestURL().toString());
        return person;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
}
