package com.company.Festival;

import com.company.ChainOfResponsibility.*;
import com.company.MediaPartner.Media;
import com.company.Mediator.Department;
import com.company.Mediator.EventMediator;
import com.company.Person;
import com.company.TSCSingleton;

import java.util.ArrayList;
import java.util.List;

public abstract class Festival {

    Media mediaPartner;
    String eventDate;
    TSCSingleton tsc = TSCSingleton.getInstance();
    EventMediator eventMediator;
    List<Department> listedDepartments;
    List<Person> personInvolved;

    public Festival(Media mediaPartner, EventMediator eventMediator)
    {
        listedDepartments = new ArrayList<>();
        personInvolved = new ArrayList<>();
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
    public void addPersonInvolved(Person person)
    {
        personInvolved.add(person);
    }

    public void communicateBetweenDepartments()
    {
        listedDepartments.get((int)Math.random()%listedDepartments.size()).sendMsg("query about event");
    }

    public void execute()
    {
        IResponsibility responsibility;
        for(Person person: personInvolved) {
            responsibility = new RegistrationResponsibility()
                    .addNext(new TShirtResponsiility()
                            .addNext(new FoodResponsibility()
                                    .addNext(new AnchoringResponsibility().
                                            addNext(new NullResponsibility()))));
            responsibility.execute(person);
        }
    }

    public abstract void organize();
    public abstract void manageEvents();
}
