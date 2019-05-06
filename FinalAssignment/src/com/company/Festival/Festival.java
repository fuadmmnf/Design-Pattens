package com.company.Festival;

import com.company.MediaPartner.Media;
import com.company.Mediator.Department;
import com.company.Mediator.EventMediator;
import com.company.TSCSingleton;

import java.util.ArrayList;
import java.util.List;

public abstract class Festival {

    Media mediaPartner;
    String eventDate;
    TSCSingleton tsc = TSCSingleton.getInstance();
    EventMediator eventMediator;
    List<Department> listedDepartments;

    public Festival(Media mediaPartner, EventMediator eventMediator)
    {
        listedDepartments = new ArrayList<>();
        this.mediaPartner = mediaPartner;
        this.eventMediator = eventMediator;
    }

    public void broadCast()
    {
        mediaPartner.broadcast();
    }

    public boolean reserveTSC(String date)
    {
        if(tsc.isDateAvailable(date)) {
            this.eventDate = date;
            return true;
        }
        return false;
    }
    public void addDepartment(Department department)
    {
        eventMediator.addCollegue(department);
        listedDepartments.add(department);
    }

    public void communicateBetweenDepartments()
    {
        listedDepartments.get((int)Math.random()%listedDepartments.size()).sendMsg("query about event");
    }

    public abstract void organize();
    public abstract void manageEvents();
}
