package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Path;
import android.graphics.Point;

public class Line implements IShape {

    Point origin, destination;

    public Line(Point origin, Point destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void draw() {
        path.moveTo(origin.x, origin.y);
        path.lineTo(destination.x, destination.y);
    }

    public Point getOrigin() {
        return origin;
    }

    public Point getDestination() {
        return destination;
    }
}
