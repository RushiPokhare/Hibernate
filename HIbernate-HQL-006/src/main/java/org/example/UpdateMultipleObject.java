package org.example;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class UpdateMultipleObject
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();


//        For Updating Data
        Transaction tx=session.beginTransaction();
        Query q=session.createQuery("update Candidate set address='pune-west' where address='pune'");
        q.executeUpdate();
        tx.commit();
        System.out.println("Candidate Updated");
        session.close();
        sf.close();
    }
}
