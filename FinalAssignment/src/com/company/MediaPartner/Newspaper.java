package com.company.MediaPartner;

import com.company.Person;

public class Newspaper extends Media {
    @Override
    public void broadcast() {
        sendContent("Content from Newspaper");
    }

    @Override
    public void sendContent(String content) {
        for(Person user: users)
            user.getContent(content);
    }
}
