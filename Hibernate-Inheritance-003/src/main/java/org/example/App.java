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
//        Employee employye= Employee.builder()
//                .name("John")
//                .address("pune")
//                .build();
//        session.save(employye);

//        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee();
//        fullTimeEmployee.setName("kunal");
//        fullTimeEmployee.setAddress("Pune");
//        fullTimeEmployee.setSalary(400);
//        session.save(fullTimeEmployee);
//
        ContractEmployee contractEmployee=new ContractEmployee();
        contractEmployee.setName("vishal");
        contractEmployee.setAddress("Mumbai");
        contractEmployee.setInvoice_amount(400);
        session.save(contractEmployee);

        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Employee added successfully");
    }
}
