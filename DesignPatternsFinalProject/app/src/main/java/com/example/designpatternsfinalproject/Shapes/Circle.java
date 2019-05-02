package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Path;
import android.graphics.Point;

public class Circle implements IShape {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void draw() {
        path.addCircle(center.x, center.y, radius, Path.Direction.CW);
    }
}
