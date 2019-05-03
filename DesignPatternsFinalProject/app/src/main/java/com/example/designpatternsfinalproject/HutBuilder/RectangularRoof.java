package com.example.designpatternsfinalproject.HutBuilder;

import android.graphics.Point;

import com.example.designpatternsfinalproject.Shapes.Rectangle;
import com.example.designpatternsfinalproject.Shapes.Triangle;

public class RectangularRoof extends Roof{
    public RectangularRoof(Point a, int width, int height, int color)
    {
        roofShape = new Rectangle(a, width, height);
        ((Rectangle) roofShape).setColor(color);
    }
}
