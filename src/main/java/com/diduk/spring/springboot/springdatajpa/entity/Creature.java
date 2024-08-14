package com.diduk.spring.springboot.springdatajpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "creature")
public class Creature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;



    @Column(name = "type")
    private String type;

    @Column(name = "country")
    private String country;


    public Creature(){}

    public Creature(int id, Person person, String type, String country) {
        this.id = id;
        this.person = person;

        this.type = type;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
