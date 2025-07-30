package com.foodorder.model;

import java.util.List;

public class FoodOrderService {
    private List<Restaurant> restaurants;

    public FoodOrderService(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public void placeOrder(Customer customer) {
        System.out.println("Searching for restaurants matching: " + customer.getPreferredCuisine());
        for (Restaurant r : restaurants) {
            if (r.getCuisines().contains(customer.getPreferredCuisine())) {
                System.out.println("Order placed at " + r.getName() + " for customer " + customer.getName());
                return;
            }
        }
        System.out.println("No matching restaurant found for " + customer.getPreferredCuisine());
    }
}
