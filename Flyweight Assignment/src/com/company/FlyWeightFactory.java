package com.company;

public class FlyWeightFactory  {

    private Rectangle[][] rectangles;

    public FlyWeightFactory(int xMax, int yMax) {
        this.rectangles = new Rectangle[xMax][yMax];

    }

    public Rectangle getRectangle(int width, int height)
    {
        Rectangle rect = null;

        if(rectangles[width][height] != null)
        {
            return rectangles[width][height];
        }
        else
        {
            return rectangles[width][height] = new Rectangle(width, height);
        }
    }
}
