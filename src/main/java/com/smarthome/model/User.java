package com.smarthome.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name = "Nikhitha";
    private String homeId = "HOME123";

    public String getName() { return name; }
    public String getHomeId() { return homeId; }
}
