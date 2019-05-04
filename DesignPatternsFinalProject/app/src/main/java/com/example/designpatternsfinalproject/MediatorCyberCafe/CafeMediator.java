package com.example.designpatternsfinalproject.MediatorCyberCafe;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public final class CafeMediator {
    List<City> collegues;
    Context parentContext;

    public CafeMediator(Context parentContext)
    {
        this.parentContext = parentContext;
        this.collegues = new ArrayList<>();
    }

    public void sendMsg(String msg)
    {
        String text = "";
        for(City collegue: collegues) {
            text += collegue.receiveMsg(msg);
            text += "\n\n";
        }
        Toast.makeText(parentContext, text, Toast.LENGTH_LONG).show();
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
