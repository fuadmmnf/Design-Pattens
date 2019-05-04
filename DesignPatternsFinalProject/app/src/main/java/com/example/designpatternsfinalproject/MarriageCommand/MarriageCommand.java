package com.example.designpatternsfinalproject.MarriageCommand;

import java.util.ArrayList;
import java.util.List;

public class MarriageCommand implements ICommand {

    ICommand executeList;
    List<ICommand> undoList = new ArrayList<>();

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
            undoList.remove(lastIndex);

        }
        else
        {
            System.out.println("Nothing to undo!");
        }
    }


}
