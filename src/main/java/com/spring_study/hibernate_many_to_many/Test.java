package com.spring_study.hibernate_many_to_many;

import com.spring_study.hibernate_many_to_many.entity.Child;
import com.spring_study.hibernate_many_to_many.entity.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Child.class)
                                    .addAnnotatedClass(Course.class)
                                    .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

            Course course1 = new Course("Football");
            Course course2 = new Course("Chess");

            Child child1 = new Child("Aleksandr", 15);
            Child child2 = new Child("Ivan", 12);
            Child child3 = new Child("Olga", 11);
            Child child4 = new Child("Natasha", 8);
            Child child5 = new Child("Robert", 11);

            course1.addChildToCourse(child1);
            course1.addChildToCourse(child4);
            course2.addChildToCourse(child2);
            course2.addChildToCourse(child3);
            course2.addChildToCourse(child5);

            session.beginTransaction();

            session.persist(course1); //when cascade type is not ALL
            session.persist(course2); //instead save() we use persist()

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }

//        try {
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Course course = session.get(Course.class, 1);
//
//            System.out.println(course);
//            System.out.println(course.getChilds());
//
//            session.getTransaction().commit();
//
//        } finally {
//            session.close();
//            factory.close();
//        }
    }
}
