package com.example.designpatternsfinalproject.ChainOfResponsibility;

import com.example.designpatternsfinalproject.Inhabitant;
import com.example.designpatternsfinalproject.WaterReservoir;

public class NullActivity implements IOperation {
    @Override
    public String performOperation(WaterReservoir waterReserver, double amount, Inhabitant inhabitant) {
        return "";
    }
}
