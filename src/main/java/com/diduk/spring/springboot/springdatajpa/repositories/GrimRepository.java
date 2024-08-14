package com.diduk.spring.springboot.springdatajpa.repositories;

import com.diduk.spring.springboot.springdatajpa.entity.Grim;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GrimRepository extends JpaRepository<Grim, Integer> {
    public List<Grim> findByCountry(String country);

}
