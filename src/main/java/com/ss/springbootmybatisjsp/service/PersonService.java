package com.ss.springbootmybatisjsp.service;

import com.ss.springbootmybatisjsp.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> showAllPerson(String seid);//展示所有

    Person showPerson(String id);//展示指定员工

    void insertPerson(Person person);//添加

    void deletePerson(String id); //删除

    void updatePerson(Person person);//修改

}
