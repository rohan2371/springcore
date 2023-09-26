package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone-config.xml");
        Person p1 = (Person) context.getBean("person1");
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println("____________________________________________________");
        System.out.println(p1.getFeestructure());
        System.out.println(p1.getFeestructure().getClass().getName());
    }
}
