package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Point;

import androidx.annotation.NonNull;

public class Circle implements IShape {

    private Point center;
    private int radius;
    private int color = Color.BLACK;

    public Circle(Point center, int radius) {
        setCenter(center);
        this.radius = radius;
    }


    public Circle( int radius) {
        this.radius = radius;
    }

    public void setCenter(Point center)
    {
        this.center = center;
    }
    public void setColor(int color)
    {
        this.color = color;
    }

    @Override
    public void draw() {
        Path path = new Path();
        path.addCircle(center.x, center.y, radius, Path.Direction.CW);
        singletonInstance.addPath(color, path);

    }
    public Circle clone()
    {
        return new Circle(center, radius);
    }


    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public int getColor() {
        return color;
    }

    @NonNull
    @Override
    public String toString() {
        return "Center: ("+center.x+", "+center.y+"), radius:"+radius;
    }
}
