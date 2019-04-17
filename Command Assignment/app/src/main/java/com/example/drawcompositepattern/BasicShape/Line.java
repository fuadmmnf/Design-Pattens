package com.example.drawcompositepattern.BasicShape;

import android.graphics.Point;

import com.example.drawcompositepattern.IShape;

import java.util.List;

public class Line implements IShape {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Line() {
    }

    @Override
    public String description() {
        return "Line from ("+x1+", "+y1+") to ("+x2+", "+y2+")\n";
    }

    @Override
    public void setPoints(List<Point> points) {
        this.x1 = points.get(0).x;
        this.x2 = points.get(1).x;
        this.y1 = points.get(0).y;
        this.y2 = points.get(1).y;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
