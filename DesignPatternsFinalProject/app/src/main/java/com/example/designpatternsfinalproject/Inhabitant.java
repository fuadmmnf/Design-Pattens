package com.example.designpatternsfinalproject;

import com.example.designpatternsfinalproject.ChainOfResponsibility.IOperation;
import com.example.designpatternsfinalproject.ChainOfResponsibility.NullActivity;
import com.example.designpatternsfinalproject.ChainOfResponsibility.PrayForWater;
import com.example.designpatternsfinalproject.ChainOfResponsibility.TakeWater;

public class Inhabitant {
    String name;

    public Inhabitant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String takeWaterFromWaterReservoir(WaterReservoir waterReservoir, double amount)
    {
        IOperation operation = new TakeWater().addNext(new PrayForWater().addNext(new NullActivity()));
        return operation.performOperation(waterReservoir, amount, this);
    }
}
