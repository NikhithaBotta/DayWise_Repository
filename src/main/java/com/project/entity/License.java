package com.project.entity;

import jakarta.persistence.*;

@Entity
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int licenseId;

    private String licenseCode;

    @OneToOne(mappedBy = "license")
    private User user;

    public int getLicenseId() { return licenseId; }
    public void setLicenseId(int licenseId) { this.licenseId = licenseId; }
    public String getLicenseCode() { return licenseCode; }
    public void setLicenseCode(String licenseCode) { this.licenseCode = licenseCode; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}