package com.company;

import java.awt.*;

public interface IShape {
	void expand(Graphics2D g2d);
	void draw(Graphics2D g2d);
	void vanish(Graphics2D g2d);
	void shrink(Graphics2D g2d);
	void changeColor(Graphics2D g2d, Color color);
	IShape clone();
	Color getColor();
}
