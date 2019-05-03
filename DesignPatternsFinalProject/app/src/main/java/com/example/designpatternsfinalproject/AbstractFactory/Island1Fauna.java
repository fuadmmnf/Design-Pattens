package com.example.designpatternsfinalproject.AbstractFactory;

import android.graphics.Point;

import com.example.designpatternsfinalproject.Shapes.ComplexShape;
import com.example.designpatternsfinalproject.Shapes.IShape;
import com.example.designpatternsfinalproject.Shapes.Line;

public class Island1Fauna implements IFauna{
    ComplexShape faunaShape;

    public Island1Fauna() {
        faunaShape = new ComplexShape();
        drawFauna(0, 0);
        drawFauna(180, 10);
        drawFauna(-40, -40);
        drawFauna(100, -20);
    }

    @Override
    public void drawFauna(int dX, int dY) {

        Line line1 = flyweight.getLine(new Point(400+dX,500+dY), new Point(350+dX, 480+dY));
        Line line2 = flyweight.getLine(new Point(400+dX,500+dY), new Point(450+dX, 480+dY));
        addToFauna(line1);
        addToFauna(line2);

        faunaShape.draw();
    }

    public void addToFauna(IShape shape)
    {
        faunaShape.addShape(shape);
    }
}
