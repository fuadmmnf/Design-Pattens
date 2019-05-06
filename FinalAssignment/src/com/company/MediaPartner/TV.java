package com.company.MediaPartner;

import com.company.Person;

public class TV extends Media {
    @Override
    public void broadcast() {
        sendContent("Content from TV");
    }

    @Override
    public void sendContent(String content) {
        for(Person user: users)
            user.getContent(content);
    }


}
