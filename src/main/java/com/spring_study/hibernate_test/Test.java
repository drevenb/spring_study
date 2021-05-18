package com.spring_study.hibernate_test;

import com.spring_study.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Ivan", "Ivanov", "IT", 500);
            session.beginTransaction();
            session.save(emp);
            int id = emp.getId();
            Employee employee = session.get(Employee.class, id);
            session.getTransaction().commit();

            System.out.println(employee);
        } finally {
            factory.close();
        }
    }
}
