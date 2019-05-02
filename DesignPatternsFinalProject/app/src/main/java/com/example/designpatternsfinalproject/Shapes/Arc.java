package com.example.designpatternsfinalproject.Shapes;

public class Arc implements IShape {

    private int left, top, bottom, right, startAngle, sweepAnlge;


    public Arc(int left, int top, int bottom, int right, int startAngle, int sweepAnlge) {
        this.left = left;
        this.top = top;
        this.bottom = bottom;
        this.right = right;
        this.startAngle = startAngle;
        this.sweepAnlge = sweepAnlge;
    }

    @Override
    public void draw() {
        path.addArc(left, top, bottom, right, startAngle, sweepAnlge);
    }
}
