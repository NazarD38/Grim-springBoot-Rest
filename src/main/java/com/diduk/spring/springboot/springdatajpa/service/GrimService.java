package com.diduk.spring.springboot.springdatajpa.service;

import com.diduk.spring.springboot.springdatajpa.entity.Grim;

import java.util.List;

public interface GrimService
{
    public List<Grim> getAllGrims();

    public void saveGrim(Grim grim);

    public Grim getGrimById(int id);

    public void deleteGrimById(int id);

    public List<Grim> findByCountry(String country);

}
