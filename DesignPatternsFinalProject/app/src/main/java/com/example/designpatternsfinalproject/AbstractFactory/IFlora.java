package com.example.designpatternsfinalproject.AbstractFactory;


import android.graphics.Path;

import com.example.designpatternsfinalproject.PathSingleton;
import com.example.designpatternsfinalproject.Shapes.ShapeFlyweight;

public interface IFlora {

    public int maxHeight=500, maxWidth =100, maxRadius=500;

    public ShapeFlyweight flyweight = new ShapeFlyweight(maxWidth, maxHeight, maxRadius);


    public Path path = PathSingleton.getInstance().getPath();
    public void drawFlora(int dX, int dY, int leafColor, int stemColor);
}
