package com.company;

import java.awt.Graphics2D;

public class Draw implements ICommand{
	IShape shape;
	Graphics2D g2d;
	
	public Draw(IShape shape,Graphics2D g2d) {
		this.shape=shape;
		this.g2d=g2d;
	}
	
	@Override
	public void execute() {
		shape.draw(g2d);
		
	}

	@Override
	public void undo() {
		shape.vanish(g2d);
		
	}

	@Override
	public void redo() {
		execute();
		
	}

}
