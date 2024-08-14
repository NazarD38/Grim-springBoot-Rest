package com.diduk.spring.springboot.springdatajpa.service;

import com.diduk.spring.springboot.springdatajpa.repositories.GrimRepository;
import com.diduk.spring.springboot.springdatajpa.entity.Grim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GrimServiceImpl implements GrimService {

    @Autowired
    private GrimRepository grimRepository;



    @Override
    @Transactional
    public List<Grim> getAllGrims() {
        return grimRepository.findAll();
    }

    @Override
    @Transactional
    public void saveGrim(Grim grim) {
        grimRepository.save(grim);
    }

    @Override
    @Transactional
    public Grim getGrimById(int id) {
        Grim grim = null;
        Optional<Grim> optionalGrim = grimRepository.findById(id);
        if (optionalGrim.isPresent()) {
            grim = optionalGrim.get();
        }
        return grim;
    }

    @Override
    @Transactional
    public void deleteGrimById(int id) {
        grimRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<Grim> findByCountry(String country) {
        List<Grim> grims = grimRepository.findByCountry(country);
        return grims;
    }

}
