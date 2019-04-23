package com.company;

import java.awt.*;

public class FlyWeightFactory  {

    private Rectangle[][] rectangles;

    public FlyWeightFactory(int xMax, int yMax) {
        this.rectangles = new Rectangle[xMax][yMax];

    }

    public Rectangle getRectangle(int width, int height, Color color)
    {
        Rectangle rect = null;

        if(rectangles[width][height] != null)
        {
            Rectangle rectangle = rectangles[width][height];
            rectangle.setColor(color);
            return rectangle;
        }
        else
        {
            Rectangle rectangle = rectangles[width][height] = new Rectangle(width, height);
            rectangle.setColor(color);
            return rectangle;
        }
    }
}
