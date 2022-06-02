package com.spring_study.hibernate_one_to_one;

import com.spring_study.hibernate_one_to_one.entity.Detail;
import com.spring_study.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Olga", "Smirnova", "HR", 700);
            Detail detail = new Detail("Baku", "+375293238931", "drevenb2@gmail.com");
            employee.setEmpDetail(detail);
            session.beginTransaction();
            session.save(employee);
            int id = employee.getId();
            Employee emp = session.get(Employee.class, id);
            session.getTransaction().commit();

            System.out.println(emp);
        } finally {
            session.close();
            factory.close();
        }
    }
}
