package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


@Scope("prototype")
@Component("obj")
public class Student {
    @Value("Rohan Konkatti")
    private String student_name;

    public List<String> getCompany() {
        return company;
    }

    public void setCompany(List<String> company) {
        this.company = company;
    }

    @Value("Solapur")
    private String city;

    @Value("#{temp}")
    private List<String>company;

    @Override
    public String toString() {
        return "Student{" +
                "student_name='" + student_name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
