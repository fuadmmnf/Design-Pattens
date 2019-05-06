package com.company;

public class MediaUser {
    String name;

    public MediaUser(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void getContent(String content)
    {
        System.out.println(this.name+" received content: "+content);
    }
}
