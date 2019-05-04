package com.example.designpatternsfinalproject.ChainOfResponsibility;

import com.example.designpatternsfinalproject.Island.Inhabitant;
import com.example.designpatternsfinalproject.Island.WaterReservoir;

public class PrayForWater implements IOperation {
    private IOperation nextOpp;
    @Override
    public String performOperation(WaterReservoir waterReserver, double amount, Inhabitant inhabitant) {
        if(waterReserver.getWaterLevel() -amount < waterReserver.getToleranceLevel()) {

            String text =  inhabitant.getName()+" praying for water, WaterLevel:" + waterReserver.getWaterLevel();
            waterReserver.setWaterLevel(waterReserver.getWaterLevel() + 5);
            return text;
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
