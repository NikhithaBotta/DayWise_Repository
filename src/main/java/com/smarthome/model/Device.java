package com.smarthome.model;

import org.springframework.stereotype.Component;

@Component
public class Device {
    private String type = "Light";
    private String status = "OFF";

    public String getType() { return type; }
    public String getStatus() { return status; }

    public void turnOn() {
        status = "ON";
        System.out.println(type + " is turned ON");
    }

    public void turnOff() {
        status = "OFF";
        System.out.println(type + " is turned OFF");
    }
}
