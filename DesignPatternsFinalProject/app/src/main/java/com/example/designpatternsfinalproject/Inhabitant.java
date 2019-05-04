package com.example.designpatternsfinalproject;

import android.util.Log;

import com.example.designpatternsfinalproject.ChainOfResponsibility.IOperation;
import com.example.designpatternsfinalproject.ChainOfResponsibility.NullActivity;
import com.example.designpatternsfinalproject.ChainOfResponsibility.PrayForWater;
import com.example.designpatternsfinalproject.ChainOfResponsibility.TakeWater;
import com.example.designpatternsfinalproject.MediatorCyberCafe.CafeMediator;
import com.example.designpatternsfinalproject.MediatorCyberCafe.CyberCafe;

public class Inhabitant implements IInhabitant{
    String name;
    String type = "local";

    public String getName() {
        return name;
    }


    public Inhabitant(String name) {
        this.name = name;
    }

    public Inhabitant(String name, String type) {
        this.name = name;
        this.type = type;
    }



    @Override
    public String takeWaterFromWaterReservoir(WaterReservoir waterReservoir, double amount)
    {
        IOperation operation = new TakeWater().addNext(new PrayForWater().addNext(new NullActivity()));
        return operation.performOperation(waterReservoir, amount, this);
    }

    @Override
    public String getDisasterAlert()
    {
        return this.name+" is alerted";
    }

    public String getMsg(String msg)
    {
        return getName()+" received message: "+msg;
    }

    public void sendMsg(CafeMediator cafeMediator, String msg)
    {
        cafeMediator.recieveMsg(msg);
    }

    public String getType() {
        return type;
    }
}
