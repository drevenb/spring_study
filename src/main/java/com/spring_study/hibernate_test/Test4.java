package com.spring_study.hibernate_test;

import com.spring_study.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 9);
//            session.delete(employee);
            session.createQuery("delete Employee where name='Sasha'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
