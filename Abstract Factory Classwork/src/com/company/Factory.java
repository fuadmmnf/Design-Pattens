package com.company;

public class Factory {

    String region;
    ICountryFactory countryFactory;
    public Factory(String region) {
        this.region = region;
    }

    public ICountryFactory createCountryFactory()
    {
        if(region.equals("Oriental"))
            countryFactory= new OrientalFactory();
        else
            countryFactory = new OccidentalFactory();

        return countryFactory;
    }


}
