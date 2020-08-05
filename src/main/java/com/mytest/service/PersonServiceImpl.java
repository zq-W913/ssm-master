package com.mytest.service;

import com.mytest.bean.PersonBean;
import com.mytest.dao.PersonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements  PersonService {
    @Resource
    PersonDao persondao = null;

    @Override
    public List<PersonBean> save() {

        return   persondao.findAll();
    }
}
