package com.example.designpatternsfinalproject.AbstractFactory;

import android.graphics.Color;
import android.graphics.Point;

import com.example.designpatternsfinalproject.HutBuilder.Body;
import com.example.designpatternsfinalproject.HutBuilder.Hut;
import com.example.designpatternsfinalproject.HutBuilder.RectangularBody;
import com.example.designpatternsfinalproject.HutBuilder.RectangularRoof;
import com.example.designpatternsfinalproject.HutBuilder.Roof;
import com.example.designpatternsfinalproject.HutBuilder.TriangularRoof;

public class Island2Factory implements IFactory {

    IFlora iFlora;
    IFauna iFauna;
    Hut hut;

    public Island2Factory()
    {
        this.iFauna = createFauna();
        this.iFlora = createFlora();

        Roof roof = new RectangularRoof(new Point(91, 980), 200,100, Color.rgb(139,69,19));
        Body body = new RectangularBody(new Point(115, 1080), 150, 80, Color.rgb(210,105,30));
        addHut(roof, body);


        roof = new TriangularRoof(new Point(380,980), new Point(250,1080), new Point(520,1080), Color.rgb(240,248,255));
        body = new RectangularBody(new Point(315, 1080), 150, 80, Color.rgb(255,222,173));
        addHut(roof, body);

    }

    private void addHut(Roof roof, Body body) {
        hut = new Hut.Builder()
                .withRoof(roof)
                .withBody(body)
                .build();
        hut.createHut();
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
