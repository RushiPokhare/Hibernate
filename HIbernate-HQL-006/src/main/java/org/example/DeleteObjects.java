package org.example;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class DeleteObjects
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();


//        For Updating Data
        Transaction tx=session.beginTransaction();
        Query q=session.createQuery("Delete from Candidate where id=7");
        q.executeUpdate();
        tx.commit();
        System.out.println("Candidate Deleted");
        session.close();
        sf.close();
    }
}
