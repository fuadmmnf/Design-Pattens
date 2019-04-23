package com.company;

import javax.swing.*;
import java.awt.*;


class Rectangle extends JPanel {

    private int height;
    private int width;
    private Color color;

    public Rectangle(int width, int heights)
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

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(10,10,width,height);
    }


}
