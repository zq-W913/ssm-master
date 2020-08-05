package com.mytest.controller;

import com.mytest.bean.PersonBean;
import com.mytest.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {
    @Autowired
    PersonService service;

    @RequestMapping("save")
    public List<PersonBean> save() {
        return service.save();

    }
}
