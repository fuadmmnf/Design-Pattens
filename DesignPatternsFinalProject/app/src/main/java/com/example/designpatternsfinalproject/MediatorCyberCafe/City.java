package com.example.designpatternsfinalproject.MediatorCyberCafe;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.designpatternsfinalproject.Inhabitant;
import com.example.designpatternsfinalproject.IslandActivity;

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

    public String receiveMsg(String msg) {
        String text = "";
        text +=getName()+" \n"+cyberCafe.recieveMsg(inhabitantList, msg);
        return text;

    }

    public String sendMsg(String msg)
    {
        return "Message sent from city: "+getName()+" by "+cyberCafe.sendMsg(inhabitantList,cafeMediator, msg);
    }
}
