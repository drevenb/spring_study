package com.spring_study.hibernate_test;

import com.spring_study.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 7);
//            emp.setSalary(1500);
            session.createQuery("update Employee set salary = salary + 200 where name='Sasha'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
