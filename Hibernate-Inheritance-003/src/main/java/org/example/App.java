package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Employee employye= Employee.builder()
                .name("John")
                .address("pune")
                .build();
        session.save(employye);
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Employee added successfully");
    }
}
