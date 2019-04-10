package com.company;

public class EncriptedFile extends DecoratedFile {

    IFile iFile;

    public EncriptedFile(IFile iFile) {
        this.iFile = iFile;
    }

    @Override
    public void readFile() {
        //..........
        System.out.println("Decription Done");
        iFile.readFile();
    }

    @Override
    public void writeFile() {
        //..........

        iFile.writeFile();
        System.out.println("Encription Done");
    }
}
