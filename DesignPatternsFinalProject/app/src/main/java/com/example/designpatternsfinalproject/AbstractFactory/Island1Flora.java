package com.example.designpatternsfinalproject.AbstractFactory;

import android.graphics.Point;

import com.example.designpatternsfinalproject.Shapes.Line;
import com.example.designpatternsfinalproject.Shapes.Polygon;

import java.nio.file.Path;

public class Island1Flora implements IFlora{
    Polygon stem;
    int DISPLACEMENT=300;
    public Island1Flora() {
        drawFlora();
    }

    @Override
    public void drawFlora() {
        //draw Island1 Flora line by line

        stem = new Polygon();
        drawStem();
    }

    private void drawStem() {


        stem.draw();
    }
}
