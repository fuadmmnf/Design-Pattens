package com.example.designpatternsfinalproject.AbstractFactory;


import android.graphics.Path;

import com.example.designpatternsfinalproject.PathSingleton;
import com.example.designpatternsfinalproject.Shapes.ShapeFlyweight;

public interface IFauna {
    public Path path = PathSingleton.getInstance().getPath();
    public ShapeFlyweight flyweight = new ShapeFlyweight(500,500,500);

    public void drawFauna(int dX, int dY);
}
