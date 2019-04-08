package com.example.drawcompositepattern.BasicShape;

import android.graphics.Point;

import com.example.drawcompositepattern.IShape;

import java.util.List;

public class Circle implements IShape {

    Point center;
    int radius;
    @Override
    public String description() {
        return "";
    }

    @Override
    public void setPoints(List<Point> points) {
        center = points.get(0);
    }
}
