package com.example.designpatternsfinalproject.MarriageCommand;

import android.content.Context;
import android.widget.Toast;

import com.example.designpatternsfinalproject.Island.Inhabitant;

public class PriestAction implements IAction {

    Inhabitant inhabitant1, inhabitant2;
    Context parentContext;

    public PriestAction(Inhabitant inhabitant1, Inhabitant inhabitant2, Context context) {
        this.parentContext = context;
        this.inhabitant1 = inhabitant1;
        this.inhabitant2 = inhabitant2;
    }

    public Inhabitant getInhabitant1() {
        return inhabitant1;
    }

    public Inhabitant getInhabitant2() {
        return inhabitant2;
    }

    @Override
    public void performMarriage() {
        Toast.makeText(parentContext, "Marriage done: "+getInhabitant1().getName()+" and "+getInhabitant2().getName(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void breakMarriage() {
        Toast.makeText(parentContext, "Marriage undone: "+getInhabitant1().getName()+" and "+getInhabitant2().getName(), Toast.LENGTH_LONG).show();
    }
}
