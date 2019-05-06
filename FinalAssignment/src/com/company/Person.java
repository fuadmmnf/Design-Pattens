package com.company;

public class Person {
    String name;
    String type = "";
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void getContent(String content)
    {
        System.out.println(this.name+" received content: "+content);
    }
}
