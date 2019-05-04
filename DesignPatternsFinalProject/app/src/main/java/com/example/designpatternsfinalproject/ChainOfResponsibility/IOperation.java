package com.example.designpatternsfinalproject.ChainOfResponsibility;

import com.example.designpatternsfinalproject.Island.Inhabitant;
import com.example.designpatternsfinalproject.Island.WaterReservoir;

public interface IOperation {
    public String performOperation(WaterReservoir waterReserver, double amount, Inhabitant inhabitant);
}
