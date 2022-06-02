package com.spring_study.hibernate_one_to_many_bi;

import com.spring_study.hibernate_one_to_many_bi.entity.Department;
import com.spring_study.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

//        try {
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("IT", 300, 1500);
//            Employee emp1 = new Employee("Ivan", "Ivanov", 500);
//            Employee emp2 = new Employee("Aleksandr", "Kuleshov", 700);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//
//            System.out.println();
//        } finally {
//            session.close();
//            factory.close();
//        }

//        try {
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//
//        } finally {
//            session.close();
//            factory.close();
//        }

        try {
            session = factory.getCurrentSession();


            session.beginTransaction();

            Department department = session.get(Department.class, 1);
            Employee employee = session.get(Employee.class, 1);

            System.out.println(employee);
            System.out.println(employee.getDepartment());

            System.out.println(department);
            System.out.println(department.getEmps());

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
