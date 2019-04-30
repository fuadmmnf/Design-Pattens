package com.company;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Command implements ICommand{
	ICommand executeList;
	ArrayList <ICommand> undoList = new ArrayList<>();
	ArrayList <ICommand> redoList = new ArrayList<>();
	
	public void addCommand(ICommand command)
	{
		this.executeList=command;
		undoList.add(command);
	}
	

	@Override
	public void execute() {
		executeList.execute();	
	}

	@Override
	public void undo() 
	{
		int lastIndex = undoList.size() - 1;
		
		if(lastIndex>-1)
		{
			undoList.get(lastIndex).undo();
			redoList.add(undoList.get(lastIndex));
			undoList.remove(lastIndex);
			
		}
		else
		{	
			JOptionPane.showMessageDialog(null,"Nothing to undo!");
			System.out.println("Nothing to undo!");
		}
	}
	
	@Override
	public void redo() {
		int lastIndex = redoList.size() - 1;
		
		if(lastIndex>-1)
		{
			redoList.get(lastIndex).execute();
			undoList.add(redoList.get(lastIndex));
			redoList.remove(lastIndex);
			
		}
		else
		{	
			JOptionPane.showMessageDialog(null,"Nothing to redo!");
			System.out.println("Nothing to redo!");
		}
	}
}
