package com.company;

public class GrameenPhone extends Operator {
    private double timeDuration;

    public GrameenPhone(double peakHourRate, double nonPeakHourRate, long peekHourStart, long peekHourDuration) {
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
