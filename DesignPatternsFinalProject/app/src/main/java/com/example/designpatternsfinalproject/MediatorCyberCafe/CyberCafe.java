package com.example.designpatternsfinalproject.MediatorCyberCafe;


import android.widget.Toast;

import com.example.designpatternsfinalproject.Inhabitant;
import com.example.designpatternsfinalproject.IslandActivity;

import java.util.List;

public  class CyberCafe {

    public CyberCafe() {
    }

    public String sendMsg(List<Inhabitant> inhabitants, CafeMediator cafeMediator, String msg)
    {
        for(Inhabitant inhabitant: inhabitants) {
            if(inhabitant.getType().equals("soft"))
                inhabitant.sendMsg(cafeMediator,  msg);
                return inhabitant.getName();
        }
        return null;
    }

    public String recieveMsg(List<Inhabitant> inhabitants, String msg)
    {
        String text = "";
        for(Inhabitant inhabitant: inhabitants) {
            if(inhabitant.getType().equals("soft"))
                text +=inhabitant.getMsg(msg)+"\n";
        }
        return text;
    }

}
