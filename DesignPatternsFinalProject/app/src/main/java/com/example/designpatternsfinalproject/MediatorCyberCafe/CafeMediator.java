package com.example.designpatternsfinalproject.MediatorCyberCafe;

import java.util.ArrayList;
import java.util.List;

public final class CafeMediator {
    List<City> collegues;

    public CafeMediator() {
        this.collegues = new ArrayList<>();
    }

    public void sendMsg(String msg)
    {
        for(City collegue: collegues)
            collegue.receiveMsg(msg);
    }

    public void recieveMsg(String msg)
    {
        sendMsg(msg);
    }

    public void addCollegue(City collegue)
    {
        collegues.add(collegue);
    }

}
