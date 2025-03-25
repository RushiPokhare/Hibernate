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
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        ContractEmployee CE =new ContractEmployee();
        CE.setInvoice_amount(10000);
        CE.setAddress("Pune");
        CE.setName("John");

//        FullTimeEmployee FTE =new FullTimeEmployee();
//        FTE.setName("Mary");
//        FTE.setAddress("Mumbai");
//        FTE.setSalary(50000);

        session.save(CE);
//        session.save(FTE);




        tx.commit();
        session.close();
        sf.close();
        System.out.println("Done");
    }
}
