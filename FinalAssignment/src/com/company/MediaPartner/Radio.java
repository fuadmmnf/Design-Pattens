package com.company.MediaPartner;

import com.company.Person;

public class Radio extends Media {
    @Override
    public void broadcast() {
        sendContent("Content from Radio");
    }

    @Override
    public void sendContent(String content) {
        for(Person user: users)
            user.getContent(content);
    }
}
