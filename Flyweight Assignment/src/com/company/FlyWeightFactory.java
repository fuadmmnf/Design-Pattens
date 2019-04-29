package com.company;

import java.awt.*;

public class FlyWeightFactory  {
    Rectangle rectangle;
    int foundCount = 0;
    private Rectangle[][] rectangles;

    public FlyWeightFactory(int xMax, int yMax) {
        this.rectangles = new Rectangle[xMax][yMax];

    }

    public Rectangle getRectangle(int width, int height, Color color)
    {
        if(rectangles[width][height] != null)
        {
            rectangle = rectangles[width][height];
            rectangle.setColor(color);
        }
        else
        {
            rectangle = rectangles[width][height] = new Rectangle(width, height);
            rectangle.setColor(color);

        }
        return rectangle;
    }

    public int getFoundCount() {
        return foundCount;
    }
}
