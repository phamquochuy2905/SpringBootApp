package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name ;
    private Long id;
    private String origin;
    private String location;


    public Food () {
        this.name = name;
        this.id = id;
        this.origin = origin;
        this.location = location;
    }

    public Long getId() {return id;}

    public String getName() {return name;}

    public String getOrigin() {return origin;}

    public String getLocation() { return location;}

}