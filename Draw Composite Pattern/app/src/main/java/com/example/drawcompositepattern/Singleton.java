package com.example.drawcompositepattern;

import android.content.Context;
import android.graphics.Point;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
   private static  Singleton instance = null;
   private List<Point> points;
   private int pointNum;


    public List<Point> getPoints() {
        return points;
    }

    public void addPoint(Point p)
    {
        points.add(p);
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public int getPointNum() {
        return pointNum;
    }

    public void setPointNum(int pointNum) {
        this.pointNum = pointNum;
    }

    private Singleton() {
        points = new ArrayList<>();
    }

    public static  Singleton getInstance() {

        synchronized (Singleton.class)
        {
            if (instance == null) {
                instance = new Singleton();
            }
        }

        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone is not allowed.");
    }
}