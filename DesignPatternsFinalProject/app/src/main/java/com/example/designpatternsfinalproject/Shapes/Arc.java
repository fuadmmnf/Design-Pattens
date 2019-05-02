package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Color;
import android.graphics.Path;

public class Arc implements IShape {

    private int left, top, bottom, right, startAngle, sweepAnlge;
    private int color = Color.BLACK;

    public Arc(int left, int top, int bottom, int right, int startAngle, int sweepAnlge) {
        this.left = left;
        this.top = top;
        this.bottom = bottom;
        this.right = right;
        this.startAngle = startAngle;
        this.sweepAnlge = sweepAnlge;
    }

    public void setColor(int color)
    {
        this.color = color;
    }

    @Override
    public void draw() {
        Path path = new Path();
        path.addArc(left, top, bottom, right, startAngle, sweepAnlge);
        singletonInstance.addPath(color, path);

    }
}
