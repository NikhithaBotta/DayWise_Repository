package com.smarthome.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomationService {

    @Autowired
    private User user;

    @Autowired
    private Device device;

    public void controlDevice() {
        System.out.println("Controlling device for user: " + user.getName() + " (" + user.getHomeId() + ")");
        device.turnOn();
        System.out.println("Current status: " + device.getStatus());
        device.turnOff();
        System.out.println("Current status: " + device.getStatus());
    }
}
