package com.springcore.construtorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-config.xml");
//        Person p  = (Person) context.getBean("person");


        Addition add = (Addition) context.getBean("add");
        add.doSum();

    }
}
