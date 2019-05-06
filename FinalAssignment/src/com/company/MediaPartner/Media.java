package com.company.MediaPartner;

import com.company.MediaUser;

import java.util.ArrayList;
import java.util.List;

public abstract class Media {

    protected List<MediaUser> users = new ArrayList<>();

    public abstract void broadcast();


    public abstract void sendContent(String content);


    public void addUser(MediaUser user)
    {
        users.add(user);
    }

    public void removeUser(MediaUser user)
    {
        users.remove(user);
    }

}
