package com.company;

import com.company.Item.Desert;
import com.company.Item.Gift;
import com.company.Item.MainDish;
import com.company.Item.SoftDrinks;

public class KidsMeal {

    private MainDish mainDish;
    private Desert desert;
    private SoftDrinks softDrinks;
    private Gift gift;


    private KidsMeal() {

    }



    public static class Builder {
        private MainDish mainDish;
        private Desert desert;
        private SoftDrinks softDrinks;
        private Gift gift;


        public Builder() {
            mainDish = null;
            desert = null;
            softDrinks = null;
            gift = null;
        }


        public Builder withMainDish(MainDish mainDish){
            this.mainDish = mainDish;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public Builder withDesert(Desert desert){
            this.desert = desert;
            return this;
        }
        public Builder withSoftDrink(SoftDrinks softDrinks){
            this.softDrinks = softDrinks;
            return this;
        }
        public Builder withGift(Gift gift){
            this.gift = gift;
            return this;
        }
        public KidsMeal build()
        {
            KidsMeal kidsMeal = new KidsMeal();
            kidsMeal.mainDish = this.mainDish;
            kidsMeal.desert = this.desert;
            kidsMeal.softDrinks = this.softDrinks;
            kidsMeal.gift = this.gift;

            return kidsMeal;
        }
    }

    public String getMainDish() {
        if(mainDish != null)
            return mainDish.toString();
        return "";
    }

    public String getDesert() {
        if(desert != null)
            return desert.toString();
        return "";
    }

    public String getSoftDrinks() {
        if(softDrinks != null)
            return softDrinks.toString();
        return "";
    }

    public String getGift() {
        if(gift != null)
            return gift.toString();
        return "";
    }

    public String getMenu() {
        return "Main Dish: " + getMainDish()
                + "\nDesert: " + getDesert()
                + "\nSoft Drinks: " + getSoftDrinks()
                + "\nGift: " + getGift();
    }



}
