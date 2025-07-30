package com.foodorder.model;

import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    private List<String> cuisines;

    public Restaurant(String name, String location, List<String> cuisines) {
        this.name = name;
        this.location = location;
        this.cuisines = cuisines;
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public List<String> getCuisines() { return cuisines; }
}
