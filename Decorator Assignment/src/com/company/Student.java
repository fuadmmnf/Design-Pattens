package com.company;

public class Student {
    private String name;
    private int age;
    private String session;
    private String department;

    public Student(String name, int age, String session, String department) {
        this.name = name;
        this.age = age;
        this.session = session;
        this.department = department;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
