package com.company;

public class File implements IFile{
    @Override
    public void readFile() {
        System.out.println("Reading File");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file");
    }
}
