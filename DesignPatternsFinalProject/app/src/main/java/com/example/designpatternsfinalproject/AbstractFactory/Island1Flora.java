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
    int originX = 900;
    int originY = 1165;
    public Island1Flora() {
        floraShape = new ComplexShape();
        drawFlora(-60, 0, Color.rgb(0,128,0), Color.rgb(139,69,19));
        drawFlora(80, 150, Color.rgb(154,205,50), Color.rgb(210,105,30));




    }

    @Override
    public void drawFlora(int dX, int dY, int leafColor, int stemColor) {

        IShape stem = flyweight.getRectangle(new Point(803+dX,1127+dY), 250,50, stemColor);
        addToFlora(stem);

        Circle leaf = flyweight.getCircle(new Point(824+dX, 980+dY), 150, leafColor);
        addToFlora(leaf);


        Log.d(TAG, "drawFlora: "+floraShape.toString());


    }

    public void addToFlora(IShape shape)
    {
        floraShape.addShape(shape);
        floraShape.draw();
    }


}
