package com.spring_study.hibernate_test2;

import com.spring_study.hibernate_test2.entity.Detail;
import com.spring_study.hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Misha", "Dokov", "Sales", 650);
//            Detail detail = new Detail("Paris", "+375295461231", "drevenb3@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(detail);
//
//            int id = employee.getId();
//            Employee emp = session.get(Employee.class, id);
//            session.getTransaction().commit();
//
//            System.out.println(emp);

            session = factory.getCurrentSession();

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 5);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();

            System.out.println();
        } finally {
            session.close();
            factory.close();
        }
    }
}
