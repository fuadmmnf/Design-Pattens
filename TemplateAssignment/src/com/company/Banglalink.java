package com.company;

public class Banglalink extends Operator {

    private double timeDuration;
    public Banglalink(double peakHourRate, double nonPeakHourRate, long peekHourStart, long peekHourDuration) {
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
