package com.example.designpatternsfinalproject.MediatorCyberCafe;

import android.util.Log;

import com.example.designpatternsfinalproject.Inhabitant;

import java.util.ArrayList;
import java.util.List;

public class City {
    String name;
    List<Inhabitant> inhabitantList;
    CyberCafe cyberCafe;
    CafeMediator cafeMediator;

    public City(String name, CafeMediator cafeMediator) {
        this.name = name;
        cyberCafe = new CyberCafe();
        this.cafeMediator = cafeMediator;
        this.inhabitantList = new ArrayList<>();
    }

    public void addInhabitant(Inhabitant inhabitant) {
        inhabitantList.add(inhabitant);
    }

    public List<Inhabitant> getInhabitantList() {
        return inhabitantList;
    }

    public String getName() {
        return name;
    }

    public void receiveMsg(String msg) {
        Log.d("CITY", getName()+" \n"+cyberCafe.recieveMsg(inhabitantList, msg));
    }

    public String sendMsg(String msg)
    {
        return "Message sent from city: "+getName()+" by "+cyberCafe.sendMsg(inhabitantList,cafeMediator, msg);
    }
}
