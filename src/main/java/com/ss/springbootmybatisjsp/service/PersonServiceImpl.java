package com.ss.springbootmybatisjsp.service;

import com.ss.springbootmybatisjsp.dao.PersonDAO;
import com.ss.springbootmybatisjsp.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDAO personDAO;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Person> showAllPerson(String seid) {
        return personDAO.show(seid);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Person showPerson(String id) {
        return personDAO.showPerson(id);
    }

    @Override
    public void insertPerson(Person person) {
        personDAO.insertPerson(person);
    }

    @Override
    public void deletePerson(String id) {
        personDAO.deletePerson(id);
    }

    @Override
    public void updatePerson(Person person) {
        personDAO.updatePerson(person);
    }
}
