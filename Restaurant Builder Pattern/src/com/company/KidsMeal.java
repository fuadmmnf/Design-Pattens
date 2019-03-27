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





}
