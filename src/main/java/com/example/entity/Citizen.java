package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "citizens")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // One-to-One Mapping with Passport
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id", unique = true)
    private Passport passport;

    public Citizen() {}

    public Citizen(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Passport getPassport() { return passport; }
    public void setPassport(Passport passport) { this.passport = passport; }
}