package com.mytest.service;

import com.mytest.bean.PersonBean;
import com.mytest.dao.PersonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface PersonService {
    //查询所有
      public List<PersonBean> save();

}
