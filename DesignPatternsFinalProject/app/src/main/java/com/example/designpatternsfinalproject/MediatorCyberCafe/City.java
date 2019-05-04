package com.example.designpatternsfinalproject.MediatorCyberCafe;

import com.example.designpatternsfinalproject.Inhabitant;

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
        cyberCafe.recieveMsg(inhabitantList, msg);
    }

    public void sendMsg(String msg)
    {
        cyberCafe.sendMsg(cafeMediator, msg);
    }
}
