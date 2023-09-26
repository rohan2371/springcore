package com.springcore.construtorinjection;

public class Certificate {
    private String course_name;
    public Certificate(String course_name)
    {
        super();
        this.course_name = course_name;
    }
    public Certificate(){
        super();
    }

    @Override
    public String toString() {
        return this.course_name;
    }
}
