package com.company;

import com.company.Payment.Call_Notification;
import com.company.Payment.SMS_Notification;
import com.company.Payment.Email_Notification;
import com.company.Payment.INotifiable;

import java.util.List;

public class User
{
    INotifiable notifiable;


    private void onCreate()
    {
        //for email notificatio
        setNotifiable(new Email_Notification());

        //for sms notification
        setNotifiable(new SMS_Notification());

        //for call notification
        setNotifiable(new Call_Notification());
    }

    public void setNotifiable(INotifiable notifiable) {
        this.notifiable = notifiable;
    }
}
