package com.company;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle implements IShape{
	int x,y,height, width;
	Color color;
	public Rectangle(int x, int y, int height, int width,Color color) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	@Override
	public void expand(Graphics2D g2d) {
		g2d.setColor(Color.white);
		width+=10;
		height+=10;
		draw(g2d);
		
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(color);
		g2d.fillRect(x, y, width, height);
		System.out.println("Drawing rectangle: start ("+x+","+y+"), width:"+width +", height:"+height);
		
	}

	@Override
	public void vanish(Graphics2D g2d) {
		g2d.setColor(Color.white);
		g2d.fillRect(x, y, width, height);
		System.out.println("Vanish rectangle: start ("+x+","+y+"), width:"+width +", height:"+height);

	}

	@Override
	public void shrink(Graphics2D g2d) {
		g2d.setColor(Color.white);
		g2d.fillRect(x, y, width, height);
		width-=10;
		height-=10;
		draw(g2d);
		
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public IShape clone() {
		return new Rectangle(x, y, width, height, color);
	}

	@Override
	public void changeColor(Graphics2D g2d, Color color) {
		this.color = color;
		draw(g2d);

	}
}
