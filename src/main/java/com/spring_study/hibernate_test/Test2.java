package com.spring_study.hibernate_test;

import com.spring_study.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employees = session.createQuery("from Employee where salary>500").getResultList();
            session.getTransaction().commit();

            for(Employee emp: employees) {
                System.out.println(emp);
            }
        } finally {
            factory.close();
        }
    }
}
