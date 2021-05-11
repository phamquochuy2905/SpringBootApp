package com.example.accessingdatajpa;

public class Food {
    private final String name;
    private final String id;
    private final String location;

    public Food (String name, String id, String location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }

    public String getId() {return id;}

    public String getName() {return name;}

    public String getLocation() {return location;}
}