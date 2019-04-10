package com.company;

public class PasswordProtected extends DecoratedFile {
    IFile iFile;

    public PasswordProtected(IFile iFile) {
        this.iFile = iFile;
    }

    @Override
    public void readFile() {
        //..........
        System.out.println("Unlocking Done");
        iFile.readFile();
    }

    @Override
    public void writeFile() {
        //..........

        iFile.writeFile();
        System.out.println("Locking Done");
    }
}
