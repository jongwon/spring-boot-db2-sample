package com.sp.db2.db2test.service;


import com.sp.db2.db2test.dao.PersonRepository;
import com.sp.db2.db2test.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Transactional
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public void savePerson(Person person) {
        personRepository.save(person);
    }


    public Page<Person> getPersonList(int pageNum, int size){
        return personRepository.findAll(PageRequest.of(pageNum, size));
    }


}
