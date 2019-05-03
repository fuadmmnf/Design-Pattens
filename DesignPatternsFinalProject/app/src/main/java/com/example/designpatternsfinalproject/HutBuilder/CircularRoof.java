package com.example.designpatternsfinalproject.HutBuilder;

import android.graphics.Point;

import com.example.designpatternsfinalproject.Shapes.Circle;

public class CircularRoof extends Roof {
    public CircularRoof(Point center, int radius, int color)
    {
        roofShape = new Circle(center, radius);
        ((Circle) roofShape).setColor(color);
    }
}
