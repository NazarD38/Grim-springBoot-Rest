package com.diduk.spring.springboot.springdatajpa.controller;

import com.diduk.spring.springboot.springdatajpa.entity.Grim;
import com.diduk.spring.springboot.springdatajpa.service.GrimService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Grim Management")
public class GrimController {

    @Autowired
    private GrimService grimService;

    @GetMapping("/grims")
    @Operation(summary = "Get all grims")
    public List<Grim> getAllGrims() {
        return grimService.getAllGrims();
    }

    @GetMapping("/grims/{id}")
    @Operation(summary = "get grim by ID")
    public Grim getGrimById(@PathVariable int id) {
        return grimService.getGrimById(id);
    }

    @GetMapping("/grims/countries/{country}")
    @Operation(summary = "get grim by country")
    public List<Grim> getGrimsByCountry(@PathVariable String country) {
        return grimService.findByCountry(country);
    }


    @PostMapping("/grims")
    @Operation(summary = "Add Grim")
    public void addGrim(@RequestBody Grim grim) {
        grimService.saveGrim(grim);
    }

    @PutMapping("/grims")
    @Operation(summary = "Update Person")
    public void updatePerson(@RequestBody Grim grim) {
        grimService.saveGrim(grim);
    }

    @DeleteMapping("/grims/{id}")
    @Operation(summary = "Delete Grim")
    public String deleteGrim(@PathVariable int id) {
        grimService.deleteGrimById(id);
        return "Grim with id : " + id + " is deleted";
    }


}
