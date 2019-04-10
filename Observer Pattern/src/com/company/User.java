package com.company;

public class User {

    private String name;
    public void getNotification()
    {
        System.out.println("Notified to user: "+this.name);
    }

    public User(String name) {
        this.name = name;
    }
}
