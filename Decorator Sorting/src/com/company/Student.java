package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Integer age;
    private Double cgpa;
    private String session;


    private List<Object> attributeList;

    public Student(String name, Integer age, Double cgpa, String session) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.session = session;

        attributeList = new ArrayList<>();
        attributeList.add(this.name);
        attributeList.add(this.age);
        attributeList.add(this.cgpa);
        attributeList.add(this.session);
    }

    @Override
    public String toString() {
        return "name: "+this.name+", age: "+this.age+", cgpa: "+this.cgpa+", session: "+this.session+"\n";
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public String getSession() {
        return session;
    }

    public List<Object> getAttributeList() {
        return attributeList;
    }
}