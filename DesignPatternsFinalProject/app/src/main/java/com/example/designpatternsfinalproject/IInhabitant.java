package com.example.designpatternsfinalproject;

import com.example.designpatternsfinalproject.ChainOfResponsibility.IOperation;
import com.example.designpatternsfinalproject.ChainOfResponsibility.NullActivity;
import com.example.designpatternsfinalproject.ChainOfResponsibility.PrayForWater;
import com.example.designpatternsfinalproject.ChainOfResponsibility.TakeWater;

public interface IInhabitant {

    public String takeWaterFromWaterReservoir(WaterReservoir waterReservoir, double amount);
    public String getDisasterAlert();
}
