package com.diduk.spring.springboot.springdatajpa.service;

import com.diduk.spring.springboot.springdatajpa.repositories.CreatureRepository;
import com.diduk.spring.springboot.springdatajpa.entity.Creature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CreatureServiceImpl implements CreatureService {

    @Autowired
    private CreatureRepository creatureRepository;

    @Override
    @Transactional
    public List<Creature> getAllCreatures() {
        return creatureRepository.findAll();
    }

    @Override
    @Transactional
    public void saveCreature(Creature creature) {
        creatureRepository.save(creature);
    }

    @Override
    @Transactional
    public Creature getCreatureById(int id) {
        Creature creature = null;
        Optional<Creature> optionalCreature = creatureRepository.findById(id);
        if (optionalCreature.isPresent()) {
            creature = optionalCreature.get();
        }
        return creature;
    }

    @Override
    @Transactional
    public void deleteCreatureById(int id) {
        creatureRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<Creature> findByCountry(String country) {
        return creatureRepository.findByCountry(country);
    }
}
