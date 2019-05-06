package com.company.Mediator;

public class Department {
    String name;
    EventMediator eventMediator;

    public Department(String name, EventMediator eventMediator) {
        this.name = name;
        this.eventMediator = eventMediator;
    }

    public void receiveMsg(String msg) {
        System.out.println(this.name+" received msg: "+msg);
    }

    public void sendMsg(String msg)
    {
        eventMediator.recieveMsg(msg);
    }

    public String getName() {
        return name;
    }
}