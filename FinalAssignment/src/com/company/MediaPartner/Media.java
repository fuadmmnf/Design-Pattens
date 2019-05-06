package com.company.MediaPartner;

import com.company.Person;

import java.util.ArrayList;
import java.util.List;

public abstract class Media {

    protected List<Person> users = new ArrayList<>();

    public abstract void broadcast();


    public abstract void sendContent(String content);


    public void addUser(Person user)
    {
        users.add(user);
    }

    public void removeUser(Person user)
    {
        users.remove(user);
    }

}
