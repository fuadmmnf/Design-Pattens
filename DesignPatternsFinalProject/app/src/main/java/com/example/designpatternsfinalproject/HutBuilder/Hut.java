package com.example.designpatternsfinalproject.HutBuilder;

public class Hut   {
    private Roof roof = null;
    private Body body = null;

    public Hut()
    {

    }


    public static class Builder {
        private Roof roof;
        private Body body;



        public Builder() {
            roof = null;
            body = null;
        }


        public Builder withRoof(Roof roof){
            this.roof = roof;
            return this;
        }
        public Builder withBody(Body body){
            this.body = body;
            return this;
        }

        public Hut build()
        {
            Hut hut = new Hut();
            hut.roof = this.roof;
            hut.body = this.body;

            return hut;
        }
    }

    public void createHut()
    {
        if(roof != null)
            this.roof.roofShape.draw();
        if(body != null)
            this.body.bodyShape.draw();
    }

}
