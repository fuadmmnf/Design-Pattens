package com.example.designpatternsfinalproject.HutBuilder;

import android.graphics.Point;

import com.example.designpatternsfinalproject.Shapes.Rectangle;

public class RectangularBody extends Body{
    public RectangularBody(Point a, int width, int height, int color)
    {
        bodyShape = new Rectangle(a, width, height);
        ((Rectangle) bodyShape).setColor(color);
    }
}
