package com.company;

public class OccidentalFactory implements ICountryFactory {
    IFlora iFlora;
    IFauna iFauna;

    public OccidentalFactory() {
        this.iFlora = createFlora();
        this.iFauna = createFauna();
    }

    @Override
    public IFlora createFlora() {
        return new OccidentalFlora();
    }

    @Override
    public IFauna createFauna() {
        return new OccidentalFauna();
    }
}
