package com.example.drawcompositepattern;

import android.graphics.Point;

import java.util.List;

public interface IShape {
    public String description();
    public void setPoints(List<Point> points);
}
