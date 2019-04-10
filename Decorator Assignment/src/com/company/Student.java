package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private double cgpa;
    private String session;


    private List<Object> attributeList;

    public Student(String name, int age, double cgpa, String session) {
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getSession() {
        return session;
    }

    public List<Object> getAttributeList() {
        return attributeList;
    }
}
