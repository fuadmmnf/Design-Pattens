package com.example.designpatternsfinalproject.ChainOfResponsibility;

import com.example.designpatternsfinalproject.Inhabitant;
import com.example.designpatternsfinalproject.WaterReservoir;

public interface IOperation {
    public String performOperation(WaterReservoir waterReserver, double amount, Inhabitant inhabitant);
}
