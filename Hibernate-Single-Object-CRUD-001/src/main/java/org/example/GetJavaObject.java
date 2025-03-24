package org.example;

import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetJavaObject {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Movie movie=session.get(Movie.class, 2);
//session.get(...) is a Hibernate method used to fetch an entity (record) from the database.
//Movie.class specifies the entity type (i.e., the class mapped to the database table).
//1 is the primary key (ID) of the movie record being retrieved.

        System.out.println(movie);
        session.close();
        sessionFactory.close();
        System.out.println("Object Got successfully");
    }
}
