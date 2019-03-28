package com.company;

import com.company.Item.Desert;
import com.company.Item.Gift;
import com.company.Item.MainDish;
import com.company.Item.SoftDrinks;

public class AdultsMeal {
    private MainDish mainDish;
    private Desert desert;
    private SoftDrinks softDrinks;
    private Gift gift;


    private AdultsMeal() {

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


        public AdultsMeal.Builder withMainDish(MainDish mainDish) {
            this.mainDish = mainDish;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }

        public AdultsMeal.Builder withDesert(Desert desert) {
            this.desert = desert;
            return this;
        }

        public AdultsMeal.Builder withSoftDrink(SoftDrinks softDrinks) {
            this.softDrinks = softDrinks;
            return this;
        }

        public AdultsMeal.Builder withGift(Gift gift) {
            this.gift = gift;
            return this;
        }

        public AdultsMeal build() {

            AdultsMeal adultsMeal = new AdultsMeal();
            adultsMeal.mainDish = this.mainDish;
            adultsMeal.desert = this.desert;
            adultsMeal.softDrinks = this.softDrinks;
            adultsMeal.gift = this.gift;

            return adultsMeal;
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
