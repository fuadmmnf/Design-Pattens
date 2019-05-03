package com.example.designpatternsfinalproject.AbstractFactory;

import android.graphics.Color;
import android.graphics.Point;
import android.util.Log;

import com.example.designpatternsfinalproject.Shapes.Circle;
import com.example.designpatternsfinalproject.Shapes.ComplexShape;
import com.example.designpatternsfinalproject.Shapes.IShape;
import com.example.designpatternsfinalproject.Shapes.Line;
import com.example.designpatternsfinalproject.Shapes.Triangle;

import java.security.Policy;

public class Island2Flora implements IFlora{
    public static final String TAG = "Island2Flora";
    ComplexShape floraShape;
    int originX = 900;
    int originY = 1165;
    public Island2Flora() {
        floraShape = new ComplexShape();
        drawFlora(-60, 0, Color.rgb(0,128,0), Color.rgb(139,69,19));
        drawFlora(80, 150, Color.rgb(195,200,109), Color.rgb(210,105,30));




    }

    @Override
    public void drawFlora(int dX, int dY, int leafColor, int stemColor) {

        IShape stem = flyweight.getRectangle(new Point(740+dX,1130+dY), 250,50, stemColor);
        addToFlora(stem);


        Triangle leaf = new Triangle(new Point(757+dX, 729+dY), new Point(640+dX, 1136+dY), new Point(892+dX, 1136+dY), leafColor);
        addToFlora(leaf);


        Log.d(TAG, "drawFlora: "+floraShape.toString());

        floraShape.draw();
    }

    public void addToFlora(IShape shape)
    {
        floraShape.addShape(shape);
    }
}
