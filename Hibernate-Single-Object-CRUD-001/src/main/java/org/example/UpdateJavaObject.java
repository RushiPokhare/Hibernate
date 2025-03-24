package org.example;

import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateJavaObject {
    public static void main(String[] args) {

        Movie movie= Movie.builder()
                .id(1)
                .title("Java")
                .year(2001)
                .genre("Action")
                .director("EBal-guru")
                .rating(9)
                .build();

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=configuration.buildSessionFactory();

        Session session= sessionFactory.openSession();

        Transaction transaction=session.beginTransaction();

        session.update(movie); // for updating object used UPDATE

        transaction.commit();

        session.close();

        sessionFactory.close();

        System.out.println("Object successfully updated");

    }
}
