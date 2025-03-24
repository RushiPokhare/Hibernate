package org.example;

import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteJavaObject {
    public static void main(String[] args) {

        Movie movie = Movie.builder()
                .id(1)
                .build();

        Configuration configuration= new Configuration();
        configuration.configure("Hibernate.cfg.xml");

        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(movie);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Object deleted successfully");
    }
}
