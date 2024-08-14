package com.diduk.spring.springboot.springdatajpa.service;


import com.diduk.spring.springboot.springdatajpa.repositories.PersonRepository;
import com.diduk.spring.springboot.springdatajpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    @Transactional
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    @Override
    @Transactional
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    @Transactional
    public Person getPersonById(int id) {
        Person person = null;
        Optional<Person> optionalPerson = personRepository.findById(id);
        if (optionalPerson.isPresent()) {
            person = optionalPerson.get();
        }
        return person;
    }

    @Override
    @Transactional
    public void deletePersonById(int id) {
        personRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<Person> findByStatus(String status) {
        List<Person> persons = personRepository.findByStatus(status);
        return persons;
    }
}
