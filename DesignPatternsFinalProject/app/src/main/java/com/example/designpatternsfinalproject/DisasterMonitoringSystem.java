package com.example.designpatternsfinalproject;

import java.util.ArrayList;
import java.util.List;

public final class DisasterMonitoringSystem {
    private List<Inhabitant> inhabitantList;

    public DisasterMonitoringSystem()
    {
        inhabitantList = new ArrayList<>();
    }

    public void addInhabitant(Inhabitant inhabitant)
    {
        inhabitantList.add(inhabitant);
    }

    public void removeInhabitant(Inhabitant inhabitant)
    {
        inhabitantList.remove(inhabitant);
    }


    public String sendAlert()
    {
        String status = "";
        for(Inhabitant inhabitant: inhabitantList)
        {
            status +=inhabitant.getDisasterAlert()+"\n";
        }
        return status;
    }

    public List<Inhabitant> getInhabitantList() {
        return inhabitantList;
    }
}
