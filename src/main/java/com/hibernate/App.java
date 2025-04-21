package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s1 = new Student();
        s1.setsName("John Doe");
        s1.setRollNo(101);
        s1.setsAge(30);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.hibernate.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        session.save(s1);
        System.out.println(s1);
    }
}
