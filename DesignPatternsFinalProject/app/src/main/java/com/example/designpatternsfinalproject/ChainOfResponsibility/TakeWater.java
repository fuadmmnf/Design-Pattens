package com.example.designpatternsfinalproject.ChainOfResponsibility;

import com.example.designpatternsfinalproject.Island.Inhabitant;
import com.example.designpatternsfinalproject.Island.WaterReservoir;

public class TakeWater implements IOperation {
    private IOperation nextOpp;
    @Override
    public String performOperation(WaterReservoir waterReserver, double amount, Inhabitant inhabitant) {
        if(waterReserver.getWaterLevel() -amount >= waterReserver.getToleranceLevel()) {
            waterReserver.setWaterLevel(waterReserver.getWaterLevel() - amount);
            return inhabitant.getName()+" taking water  amount:" + amount + ", WaterLevel:" + waterReserver.getWaterLevel();
        }
        else
            return this.nextOpp.performOperation(waterReserver, amount, inhabitant);
    }

    public TakeWater addNext(IOperation nextOpp)
    {
        this.nextOpp = nextOpp;
        return this;
    }
}
