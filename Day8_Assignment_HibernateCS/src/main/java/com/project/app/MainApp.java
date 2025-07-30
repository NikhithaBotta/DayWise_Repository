package com.project.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.project.entity.User;
import com.project.entity.License;
import com.project.util.HibernateUtil;

public class MainApp {
    public static void main(String[] args) {
        User user = new User();
        user.setFullName("Evelyn");

        License license = new License();
        license.setLicenseCode("LIC78912");

        user.setLicense(license);
        license.setUser(user);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(user);

        tx.commit();
        session.close();

        System.out.println("User and License saved successfully.");
    }
}