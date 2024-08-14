package com.diduk.spring.springboot.springdatajpa.service;



import com.diduk.spring.springboot.springdatajpa.entity.Person;

import java.util.List;

public interface PersonService {
    public List<Person> getAllPerson();

    public void savePerson(Person person);

    public Person getPersonById(int id);

    public void deletePersonById(int id);

    public List<Person>findByStatus(String status);
}
