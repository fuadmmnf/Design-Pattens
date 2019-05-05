package com.company.Mediator;

import java.util.ArrayList;
import java.util.List;

public class EventMediator {

    List<Department> collegues;

    public EventMediator() {
        this.collegues = new ArrayList<>();
    }

    public void sendMsg(String msg)
    {
        for(Department collegue: collegues)
            collegue.receiveMsg(msg);
    }

    public void recieveMsg(String msg)
    {
        System.out.println("Event received: "+msg);
        sendMsg(msg);
    }

    public void addCollegue(Department collegue)
    {
        collegues.add(collegue);
    }

}
