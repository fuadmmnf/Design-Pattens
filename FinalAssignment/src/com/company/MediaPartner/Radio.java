package com.company.MediaPartner;

import com.company.MediaUser;

public class Radio extends Media {
    @Override
    public void broadcast() {
        sendContent("Content from Radio");
    }

    @Override
    public void sendContent(String content) {
        for(MediaUser user: users)
            user.getContent(content);
    }
}
