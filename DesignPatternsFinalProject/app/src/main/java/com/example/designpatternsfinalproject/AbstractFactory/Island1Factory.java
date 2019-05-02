package com.example.designpatternsfinalproject.AbstractFactory;

public class Island1Factory implements IFactory {

    IFlora iFlora;
    IFauna iFauna;


    public Island1Factory()
    {
        this.iFauna = createFauna();
        this.iFlora = createFlora();
    }

    @Override
    public IFlora createFlora() {
        return new Island1Flora();
    }

    @Override
    public IFauna createFauna() {
        return new Island1Fauna();
    }
}
