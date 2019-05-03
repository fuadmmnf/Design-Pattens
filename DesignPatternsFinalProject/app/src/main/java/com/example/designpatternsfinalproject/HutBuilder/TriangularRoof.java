package com.example.designpatternsfinalproject.HutBuilder;

import android.graphics.Point;

import com.example.designpatternsfinalproject.Shapes.Triangle;

public class TriangularRoof extends Roof {


    public TriangularRoof(Point a, Point b, Point c, int color)
    {
        roofShape = new Triangle(a, b, c, color);
    }


}
