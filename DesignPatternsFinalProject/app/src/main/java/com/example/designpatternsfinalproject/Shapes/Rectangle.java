package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Path;
import android.graphics.RectF;

public class Rectangle implements IShape {

    private int left, top, right, bottom;

    public Rectangle(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    @Override
    public void draw() {
        path.addRect(left, top, right, bottom, Path.Direction.CW);
    }
}
