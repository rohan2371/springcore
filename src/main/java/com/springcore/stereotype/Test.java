package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereo-config.xml");
//        Student student1 = (Student)context.getBean("obj");
//        System.out.println(student1);
//        System.out.println(student1.hashCode());
//
//        Student student2 = (Student) context.getBean("obj");
//        System.out.println(student2.hashCode());
        Teacher t1 = (Teacher) context.getBean("teacher");
        Teacher t2 = (Teacher) context.getBean("teacher");

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

    }
}
