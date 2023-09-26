package com.springcore.autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire-annotation-config.xml");
        Emp emp1 = (Emp)context.getBean("emp1",Emp.class);
        System.out.println(emp1);
    }
}
