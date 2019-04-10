package com.company;

public class Teletalk extends Operator {

    private double timeDuration;
    public Teletalk(double peakHourRate, double nonPeakHourRate, long peekHourStart, long peekHourDuration) {
        super(peakHourRate, nonPeakHourRate, peekHourStart, peekHourDuration);
    }


    @Override
    public double calculatePeakHourRate(double duration) {
        return duration * super.peakHourRate;
    }

    @Override
    public double calculateNonPeakHourRate(double duration) {
        return duration * nonPeakHourRate;
    }
}
