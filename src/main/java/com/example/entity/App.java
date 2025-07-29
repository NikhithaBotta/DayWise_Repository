package com.example.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {

        Passport passport = new Passport("P123456789");
        Citizen citizen = new Citizen("John Doe", passport);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            session.persist(citizen);

            tx.commit();
            System.out.println("Citizen and Passport saved successfully!");
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Citizen savedCitizen = session.get(Citizen.class, 1L);
            if (savedCitizen != null) {
                System.out.println("Citizen Name: " + savedCitizen.getName());
                System.out.println("Passport No: " + savedCitizen.getPassport().getPassportNumber());
            }
        }
    }
}