package com.company;

public class Robi extends Operator {

    private double timeDuration;
    public Robi(double peakHourRate, double nonPeakHourRate, long peekHourStart, long peekHourDuration) {
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
