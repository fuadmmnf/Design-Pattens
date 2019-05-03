package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Path;
import android.graphics.Point;

import androidx.annotation.NonNull;

public class Triangle implements IShape {

    Point a, b, c;
    int color;
    public Triangle(Point a, Point b, Point c, int color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color)
    {
        this.color = color;
    }

    @NonNull
    @Override
    public String toString() {
        return "a: "+a+", b:"+b+", c:"+c;
    }

    @Override
    public void draw() {
        Path path = new Path();
        path.moveTo(a.x, a.y);
        path.lineTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.close();
        singletonInstance.addPath(color, path);
    }
}
