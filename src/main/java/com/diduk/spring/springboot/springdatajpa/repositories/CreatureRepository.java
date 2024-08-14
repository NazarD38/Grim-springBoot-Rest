package com.diduk.spring.springboot.springdatajpa.repositories;

import com.diduk.spring.springboot.springdatajpa.entity.Creature;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreatureRepository extends JpaRepository<Creature, Integer> {
    public List<Creature> findByCountry(String country);
}
