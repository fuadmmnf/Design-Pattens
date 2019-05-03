package com.example.designpatternsfinalproject.AbstractFactory;

import android.graphics.Color;
import android.graphics.Point;

import com.example.designpatternsfinalproject.Shapes.ComplexShape;
import com.example.designpatternsfinalproject.Shapes.IShape;
import com.example.designpatternsfinalproject.Shapes.Rectangle;
import com.example.designpatternsfinalproject.Shapes.Triangle;

public class Island2Fauna implements IFauna{
    ComplexShape faunaShape;

    public Island2Fauna() {
        faunaShape = new ComplexShape();
        drawFauna(0, 0);
        drawFauna(368, 0);



    }

    @Override
    public void drawFauna(int dX, int dY) {

        Rectangle body = flyweight.getRectangle(new Point(292+dX, 340+dY), 50, 50, /*Color.rgb(255,165,0)*/Color.WHITE);
        addToFauna(body);
        Triangle head = new Triangle(new Point(280+dX,  273+dY), new Point(351+dX, 273+dY), new Point(318+dX, 336+dY), /*Color.rgb(255,165,0)*/ Color.WHITE);
        addToFauna(head);
        faunaShape.draw();
    }

    public void addToFauna(IShape shape)
    {
        faunaShape.addShape(shape);
    }
}
