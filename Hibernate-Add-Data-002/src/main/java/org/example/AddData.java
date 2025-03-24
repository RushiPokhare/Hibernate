package org.example;

import org.example.model.Books;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


//Here We used Collection that may create two tables

public class AddData {
    public static void main(String[] args) {
        Books books= Books.builder()
                .title("Yayati")
                .author("V. S. Khandekar")
                .publisher("Continental Prakashan")
                .bookmodes(List.of("Library","Physical"))
                .build();
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(books);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Data added successfully");
    }
}
