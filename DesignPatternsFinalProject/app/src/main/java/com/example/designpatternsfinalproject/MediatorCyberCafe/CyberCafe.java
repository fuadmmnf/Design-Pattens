package com.example.designpatternsfinalproject.MediatorCyberCafe;


import com.example.designpatternsfinalproject.Inhabitant;

import java.util.List;

public  class CyberCafe {

    public CyberCafe() {
    }

    public void sendMsg(CafeMediator cafeMediator, String msg)
    {
        cafeMediator.recieveMsg(msg);
    }

    public void recieveMsg(List<Inhabitant> inhabitants, String msg)
    {
        for(Inhabitant inhabitant: inhabitants) {
            if(inhabitant.getType().equals("soft"))
                inhabitant.getMsg(msg);
        }
    }

}
