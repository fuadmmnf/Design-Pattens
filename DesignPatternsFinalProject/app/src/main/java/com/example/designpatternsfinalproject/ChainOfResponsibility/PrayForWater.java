package com.example.designpatternsfinalproject.ChainOfResponsibility;

import com.example.designpatternsfinalproject.Inhabitant;
import com.example.designpatternsfinalproject.WaterReservoir;

public class PrayForWater implements IOperation {
    private IOperation nextOpp;
    @Override
    public String performOperation(WaterReservoir waterReserver, double amount, Inhabitant inhabitant) {
        if(waterReserver.getWaterLevel() -amount < waterReserver.getToleranceLevel()) {
            waterReserver.setWaterLevel(waterReserver.getWaterLevel() - amount);
            return inhabitant.getName()+" praying for water, WaterLevel:" + waterReserver.getWaterLevel();
        }
        else
            return this.nextOpp.performOperation(waterReserver, amount, inhabitant);
    }

    public PrayForWater addNext(IOperation nextOpp)
    {
        this.nextOpp = nextOpp;
        return this;
    }
}
