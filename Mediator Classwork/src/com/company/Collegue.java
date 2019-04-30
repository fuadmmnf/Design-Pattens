package com.company;

public class Collegue {
    Mediator mediator;

    public Collegue(Mediator mediator) {
        this.mediator = mediator;
    }

    public void receiveMsg(String msg)
    {
        System.out.println("Message is: "+msg);
    }

    public void sendMsg(String msg)
    {
        mediator.recieveMsg(msg);
    }
}
