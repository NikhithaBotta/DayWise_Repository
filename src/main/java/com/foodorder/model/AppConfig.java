package com.foodorder.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Customer customer() {
        return new Customer("Nikhitha", "99999", "Italian");
    }

    @Bean
    public Restaurant r1() {
        return new Restaurant("Pizza Hub", "Hyderabad", Arrays.asList("Italian", "Mexican"));
    }

    @Bean
    public Restaurant r2() {
        return new Restaurant("Spicy Bowl", "Hyderabad", Arrays.asList("Indian", "Chinese"));
    }

    @Bean
    public FoodOrderService foodOrderService() {
        List<Restaurant> restaurants = Arrays.asList(r1(), r2());
        return new FoodOrderService(restaurants);
    }
}
