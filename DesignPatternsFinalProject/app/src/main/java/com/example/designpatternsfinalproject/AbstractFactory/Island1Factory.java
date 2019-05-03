package com.example.designpatternsfinalproject.AbstractFactory;

import android.graphics.Color;
import android.graphics.Point;

import com.example.designpatternsfinalproject.HutBuilder.Body;
import com.example.designpatternsfinalproject.HutBuilder.Hut;
import com.example.designpatternsfinalproject.HutBuilder.RectangularBody;
import com.example.designpatternsfinalproject.HutBuilder.RectangularRoof;
import com.example.designpatternsfinalproject.HutBuilder.Roof;
import com.example.designpatternsfinalproject.HutBuilder.TriangularRoof;

public class Island1Factory implements IFactory {

    IFlora iFlora;
    IFauna iFauna;
    Hut hut;

    public Island1Factory()
    {
        this.iFauna = createFauna();
        this.iFlora = createFlora();

        Roof roof = null;
        Body body = new RectangularBody(new Point(115, 910), 150, 250, Color.rgb(47,79,79));
        addHut(roof, body);


        roof = new TriangularRoof(new Point(380,980), new Point(250,1080), new Point(520,1080), Color.rgb(128,128,0));
        body = new RectangularBody(new Point(315, 1080), 150, 80, Color.rgb(210,105,30));
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
        return new Island1Flora();
    }

    @Override
    public IFauna createFauna() {
        return new Island1Fauna();
    }
}
