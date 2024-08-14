package com.diduk.spring.springboot.springdatajpa.service;

import com.diduk.spring.springboot.springdatajpa.entity.Creature;

import java.util.List;

public interface CreatureService {

    public List<Creature> getAllCreatures();

    public void saveCreature(Creature creature);

    public Creature getCreatureById(int id);

    public void deleteCreatureById(int id);


    public List<Creature> findByCountry(String country);
}
