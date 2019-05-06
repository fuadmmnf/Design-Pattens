package com.company.MediaPartner;

import com.company.MediaUser;

public class TV extends Media {
    @Override
    public void broadcast() {
        sendContent("Content from TV");
    }

    @Override
    public void sendContent(String content) {
        for(MediaUser user: users)
            user.getContent(content);
    }


}
