package com.example.designpatternsfinalproject.MarriageCommand;

public class BreakMarriage implements ICommand {
    IAction action;

    public BreakMarriage(IAction action) {
        this.action = action;
    }

    @Override
    public void execute() {
        action.breakMarriage();
    }

    @Override
    public void undo() {
        action.performMarriage();
    }
}
