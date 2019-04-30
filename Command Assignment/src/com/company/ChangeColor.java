package com.company;

import java.awt.*;

public class ChangeColor implements ICommand {
    IShape shape;
    Graphics2D g2d;
    Color color;
    Color prevColor;
    public ChangeColor(IShape shape,Graphics2D g2d, Color color) {
        this.shape = shape;
        prevColor = shape.getColor();
        this.g2d=g2d;
        this.color = color;
    }

    @Override
    public void execute() {
        shape.changeColor(g2d, color);

    }

    @Override
    public void undo() {
        shape.changeColor(g2d, prevColor);

    }

    @Override
    public void redo() {
        execute();
    }
}
