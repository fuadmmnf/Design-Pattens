package com.example.designpatternsfinalproject.MarriageCommand;

public class PerformMarriage implements ICommand {


    IAction action;

    public PerformMarriage(IAction action) {
        this.action = action;
    }

    @Override
    public void execute() {
        action.performMarriage();
    }

    @Override
    public void undo() {
        action.breakMarriage();
    }
}
