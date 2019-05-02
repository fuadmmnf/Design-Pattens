package com.example.designpatternsfinalproject.AbstractFactory;

public class Island2Factory implements IFactory {

    IFlora iFlora;
    IFauna iFauna;


    public Island2Factory()
    {
        this.iFauna = createFauna();
        this.iFlora = createFlora();
    }


    @Override
    public IFlora createFlora() {
        return new Island2Flora();
    }

    @Override
    public IFauna createFauna() {
        return new Island2Fauna();
    }
}
