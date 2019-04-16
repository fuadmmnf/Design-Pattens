package com.company;

import javax.swing.*;
import java.awt.*;


class Rectangle extends JPanel {

    private int height;
    private int width;

    public Rectangle(int width, int heights)
    {
        this.height = height;
        this.width = width;
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(10,10,width,height);
    }


}
