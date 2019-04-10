package com.company;

import java.util.ArrayList;
import java.util.List;

public  class Subject {

    List<User> observer;

    public Subject() {
        this.observer = new ArrayList<>();
    }

    public void sendNotification()
    {
        //send noti to users

        for(User user: observer)
        {
            user.getNotification();
        }
    }
    public void subscribe(User user)
    {
        observer.add(user);
    }

    public void unsubscribe(User user)
    {
        observer.remove(user);
    }


}
