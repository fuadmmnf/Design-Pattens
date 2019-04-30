package com.company;

import javax.swing.*;
import java.awt.*;


class Rectangle{

    private int height;
    private int width;
    private Color color;

    public Rectangle(int width, int height)
    {
        this.height = height;
        this.width = width;

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillRect(150, 200, width, height);
    }


}
