package com.mytest.dao;

import com.mytest.bean.PersonBean;

import java.util.List;

public interface PersonDao {
    /*查询所有*/
    public List<PersonBean> findAll();
    /*添加*/
    public int  add(PersonBean person);
    /*删除*/
    public int delete(int id);
    /*修改*/
    public int update(PersonBean person );
}
