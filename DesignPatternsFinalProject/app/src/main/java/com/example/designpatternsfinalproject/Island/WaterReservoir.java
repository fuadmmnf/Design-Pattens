package com.example.designpatternsfinalproject.Island;

public final class WaterReservoir {
    public double waterLevel;
    public double toleranceLevel;


    public WaterReservoir(int waterLevel, int toleranceLevel)
    {
        this.waterLevel = waterLevel;
        this.toleranceLevel = toleranceLevel;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public double getToleranceLevel() {
        return toleranceLevel;
    }

    public void setToleranceLevel(double toleranceLevel) {
        this.toleranceLevel = toleranceLevel;
    }
}
