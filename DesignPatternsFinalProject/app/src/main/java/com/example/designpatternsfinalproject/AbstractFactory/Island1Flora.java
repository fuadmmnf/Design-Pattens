package com.example.designpatternsfinalproject.AbstractFactory;

import android.graphics.Color;
import android.graphics.Point;
import android.util.Log;

import com.example.designpatternsfinalproject.Shapes.Circle;
import com.example.designpatternsfinalproject.Shapes.ComplexShape;
import com.example.designpatternsfinalproject.Shapes.IShape;
import com.example.designpatternsfinalproject.Shapes.Line;
import com.example.designpatternsfinalproject.Shapes.Rectangle;

public class Island1Flora implements IFlora{

    public static final String TAG = "Island1Flora";
    ComplexShape floraShape;

    public Island1Flora() {
        floraShape = new ComplexShape();
        drawFlora(0, 0);
        drawFlora(150, 50);


    }

    @Override
    public void drawFlora(int dX, int dY) {

        IShape stem = flyweight.getRectangle(new Point(600+dX,580+dY), 250,50, Color.rgb(139,69,19));
        addToFlora(stem);

        Circle leaf = flyweight.getCircle(new Point(570+dX, 550+dY), 30, Color.rgb(0,128,0));
        addToFlora(leaf);

        leaf = flyweight.getCircle(new Point(557+dX, 550+dY), 50, Color.rgb(0,128,0));
        addToFlora(leaf);

        leaf = flyweight.getCircle(new Point(665+dX, 565+dY), 50, Color.rgb(0,128,0));
        addToFlora(leaf);

        leaf = flyweight.getCircle(new Point(625+dX, 500+dY), 60, Color.rgb(0,128,0));
        addToFlora(leaf);



        Log.d(TAG, "drawFlora: "+floraShape.toString());


    }

    public void addToFlora(IShape shape)
    {
        floraShape.addShape(shape);
        floraShape.draw();
    }


}
