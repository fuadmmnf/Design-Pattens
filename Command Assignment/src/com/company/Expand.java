package com.company;

import java.awt.Graphics2D;

public class Expand implements ICommand{
	IShape shape;
	Graphics2D g2d;
	
	public Expand(IShape shape,Graphics2D g2d) {
		this.shape=shape;
		this.g2d=g2d;
	}
	
	@Override
	public void execute() {
		shape.expand(g2d);
		
	}

	@Override
	public void undo() {
		shape.shrink(g2d);
		
	}

	@Override
	public void redo() {
		execute();
		
	}
}