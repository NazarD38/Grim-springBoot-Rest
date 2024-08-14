package com.diduk.spring.springboot.springdatajpa.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Person")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    private LocalDate birthday;

    private String status;

    public Person() {

    }

    public Person(int id, String name, String surname, LocalDate birthday, String status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
