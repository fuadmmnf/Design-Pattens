package com.company;

import com.company.Item.*;

public class Restaurant {

    private KidsMeal kidsMeal;
    private AdultsMeal adultsMeal;


    public Restaurant()
    {
         this.kidsMeal = new KidsMeal.Builder()
                 .withMainDish(new Burger())
                 .withDesert(new Donut())
                 .withSoftDrink(new Pepsi())
                 .withGift(new Car())
                 .build();


         this.adultsMeal = new AdultsMeal.Builder()
                 .withMainDish(new Pizza())
                 .withDesert(new CheeseCake())
                 .withSoftDrink(new Fanta())
                 .withGift(new KeyRing())
                 .build();

    }

    public KidsMeal getKidsMeal() {
        return kidsMeal;
    }

    public void setKidsMeal(KidsMeal kidsMeal) {
        this.kidsMeal = kidsMeal;
    }

    public AdultsMeal getAdultsMeal() {
        return adultsMeal;
    }

    public void setAdultsMeal(AdultsMeal adultsMeal) {
        this.adultsMeal = adultsMeal;
    }
}
