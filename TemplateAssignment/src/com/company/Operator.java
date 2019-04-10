package com.company;

import java.sql.Time;

public abstract class Operator {

    protected double peakHourRate;
    protected double nonPeakHourRate;

    protected long peekHourStart;
    protected long peekHourDuration;

    private long peekDuration = 0;
    private long nonPeekDuration;



    protected long startTime = 1231;
    protected long talkTime = 23128461; //in milli

    public Operator(double peakHourRate, double nonPeakHourRate, long peekHourStart, long peekHourDuration) {
        this.peakHourRate = peakHourRate;
        this.nonPeakHourRate = nonPeakHourRate;
        this.peekHourStart = peekHourStart;
        this.peekHourDuration = peekHourDuration;

    }

    public double getCost()
    {
        if(startTime<peekHourStart && (startTime+talkTime)> (peekHourStart+peekHourDuration))
        {
            peekDuration = peekHourDuration;
        }
        if((startTime+talkTime)>peekHourStart && (startTime+talkTime)<(peekHourStart+peekHourDuration))
        {
            peekDuration = (startTime+talkTime) - peekHourStart;
        }
        if((startTime+talkTime)>(peekHourStart+peekHourDuration) && (startTime)< (peekHourStart+peekHourDuration))
        {
            peekDuration = (peekHourStart+peekHourDuration) - startTime;
        }
        nonPeekDuration = talkTime - peekDuration;


        System.out.println("PEEK HOUR TIME: "+peekDuration);
        System.out.println("NON PEEK HOUR TIME: "+nonPeekDuration);
        double peekCost = calculatePeakHourRate(peekDuration);

        System.out.println("PEEK COST: "+peekCost);
        double nonPeekCost = calculateNonPeakHourRate(nonPeekDuration);
        System.out.println("NON PEEK COST: "+nonPeekCost);

        return peekCost + nonPeekCost;
    }


    public  abstract double calculatePeakHourRate(double duration);
    public  abstract double calculateNonPeakHourRate(double duration);
}
