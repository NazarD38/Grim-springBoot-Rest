package com.diduk.spring.springboot.springdatajpa.controller;

import com.diduk.spring.springboot.springdatajpa.entity.Creature;
import com.diduk.spring.springboot.springdatajpa.service.CreatureService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Creature Management")
public class CreatureController {

    @Autowired
    private CreatureService creatureService;

    @GetMapping("/creatures")
    @Operation(summary = "Get all creature")
    public List<Creature> getAllCreatures() {
        return creatureService.getAllCreatures();
    }

    @GetMapping("/creatures/{id}")
    @Operation(summary = "get creature by ID")
    public Creature getCreatureById(@PathVariable int id) {
        return creatureService.getCreatureById(id);
    }

    @GetMapping("/grims/creatures-countries/{country}")
    @Operation(summary = "get creature by country")
    public List<Creature> getCreatureByCountry(@PathVariable String country) {
        return creatureService.findByCountry(country);
    }


    @PostMapping("/creatures")
    @Operation(summary = "Add Creature")
    public void addCreature(@RequestBody Creature creature) {
        creatureService.saveCreature(creature);
    }

    @PutMapping("/creatures")
    @Operation(summary = "Update Creature")
    public void updateCreature(@RequestBody Creature creature) {
        creatureService.saveCreature(creature);
    }

    @DeleteMapping("/creatures/{id}")
    @Operation(summary = "Delete Creature")
    public String deleteCreature(@PathVariable int id) {
        creatureService.deleteCreatureById(id);
        return "Creature with id : " + id + " is deleted";
    }


}
