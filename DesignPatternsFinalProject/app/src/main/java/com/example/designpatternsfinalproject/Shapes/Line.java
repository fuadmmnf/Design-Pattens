package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Point;

public class Line implements IShape {

    Point origin, destination;
    int color = Color.BLACK;
    public Line(Point origin, Point destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void draw() {
        Path path = new Path();
        path.moveTo(origin.x, origin.y);
        path.lineTo(destination.x, destination.y);
        singletonInstance.addPath(color, path);
    }
    public void setColor(int color)
    {
        this.color = color;
    }

    public Point getOrigin() {
        return origin;
    }

    public Point getDestination() {
        return destination;
    }
}
