package com.diduk.spring.springboot.springdatajpa.controller;


import com.diduk.spring.springboot.springdatajpa.entity.Person;
import com.diduk.spring.springboot.springdatajpa.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Person Management")
public class PersonController {

    @Autowired
    private PersonService personService;


    @Operation(summary = "Get all persons", description = "Retrieve all persons")
    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getAllPerson();
    }

    @Operation(summary = "Get person by ID", description = "Retrieve a person by ID")
    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable int id) {
        return personService.getPersonById(id);
    }


    @Operation(summary = "Get person by Status", description = "Dead or Live")
    @GetMapping("/persons/status/{status}")
    public List<Person> getAllPersons(@PathVariable String status) {
        List<Person> persons = personService.findByStatus(status);
        return persons;
    }

    @PostMapping("/persons")
    @Operation(summary = "Add Person")
    public Person addPerson(@RequestBody Person person) {
        personService.savePerson(person);
        return person;
    }

    @PutMapping("/persons")
    @Operation(summary = "Update Person")
    public Person updatePerson(@RequestBody Person person) {
        personService.savePerson(person);
        return person;
    }

    @DeleteMapping("/persons/{id}")
    @Operation(summary = "Delete Person")
    public String deletePerson(@PathVariable int id) {
        personService.deletePersonById(id);
        return "success";
    }



}
