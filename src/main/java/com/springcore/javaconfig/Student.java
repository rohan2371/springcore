package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("s1")
public class Student {
    public void study(){
        System.out.println("student is reading book");
    }
}
