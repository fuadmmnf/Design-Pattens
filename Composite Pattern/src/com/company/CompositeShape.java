package com.company;

import java.util.ArrayList;

class CompositeShape implements IShape {
    private String name;
    private ArrayList includedFiles = new ArrayList();

    public CompositeShape(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    public void draw() {

        for (Object includedFile : includedFiles) {
            // Leverage the "lowest common denominator"
            IShape obj = (IShape) includedFile;
            obj.draw();
        }

    }
}
