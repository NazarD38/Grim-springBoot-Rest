package com.diduk.spring.springboot.springdatajpa.repositories;





import com.diduk.spring.springboot.springdatajpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    public List<Person>findByStatus(String status);
}
