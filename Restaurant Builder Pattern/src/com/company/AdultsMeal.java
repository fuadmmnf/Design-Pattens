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
        }


        public AdultsMeal.Builder withMainDish(MainDish mainDish){
            this.mainDish = mainDish;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public AdultsMeal.Builder withDesert(Desert desert){
            this.desert = desert;
            return this;
        }
        public AdultsMeal.Builder withSoftDrink(SoftDrinks softDrinks){
            this.softDrinks = softDrinks;
            return this;
        }
        public AdultsMeal.Builder withGift(Gift gift){
            this.gift = gift;
            return this;
        }
        public AdultsMeal build(){

            AdultsMeal adultsMeal = new AdultsMeal();
            adultsMeal.mainDish = this.mainDish;
            adultsMeal.desert = this.desert;
            adultsMeal.softDrinks = this.softDrinks;
            adultsMeal.gift = this.gift;

            return adultsMeal;
        }
    }


}
