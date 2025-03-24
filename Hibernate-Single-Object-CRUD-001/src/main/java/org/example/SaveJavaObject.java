package org.example;

import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

public class SaveJavaObject {
    public static void main(String[] args) {
        Movie movie = Movie.builder()
                .title("C++")
                .year(1979)
                .genre("Story")
                .director("Bjarne")
                .rating(8)
                .build();

     Configuration configuration = new Configuration();
     configuration.configure("hibernate.cfg.xml");

     SessionFactory sessionFactory = configuration.buildSessionFactory();

     Session session=sessionFactory.openSession();
     Transaction transaction=session.beginTransaction();

     session.save(movie);  //For adding the object use SAVE

     transaction.commit();
     session.close();
     sessionFactory.close();

        System.out.println("Object successfully created");
    }
}