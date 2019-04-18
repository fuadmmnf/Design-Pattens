package com.company;

import java.util.ArrayList;
import java.util.List;

public final class Mediator {
    List<Collegue> collegues;

    public Mediator() {
        this.collegues = new ArrayList<>();
    }

    public void sendMsg(String msg)
    {
        for(Collegue collegue: collegues)
            collegue.receiveMsg(msg);
    }

    public void recieveMsg(String msg)
    {
        System.out.println("Message received is: "+msg);
        sendMsg(msg);
    }

    public void addCollegue(Collegue collegue)
    {
        collegues.add(collegue);
    }

}
