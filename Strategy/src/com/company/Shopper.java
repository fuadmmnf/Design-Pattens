package com.company;

import com.company.Payment.BkashPayment;
import com.company.Payment.CashPayment;
import com.company.Payment.IPayable;

import java.util.List;

public class Shopper
{
    IPayable payable;

    List<Product> products;

    private void cashout()
    {
        //for cash payment action listener
        setPayable(new CashPayment());

        //for bkash payment action listener
        setPayable(new BkashPayment());
    }

    public void setPayable(IPayable payable) {
        this.payable = payable;
    }
}
