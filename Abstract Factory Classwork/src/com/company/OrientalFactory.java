package com.company;

public class OrientalFactory implements  ICountryFactory {

    IFlora iFlora;
    IFauna iFauna;

    public OrientalFactory() {
        this.iFlora = createFlora();
        this.iFauna = createFauna();
    }

    @Override
    public IFlora createFlora() {
        return new OrientalFlora();
    }

    @Override
    public IFauna createFauna() {
        return new OrientalFauna();
    }
}
