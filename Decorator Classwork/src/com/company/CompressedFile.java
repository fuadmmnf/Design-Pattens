package com.company;

public class CompressedFile extends DecoratedFile {
    IFile iFile;

    public CompressedFile (IFile iFile) {
        this.iFile = iFile;
    }

    @Override
    public void readFile() {
        //..........
        System.out.println("Decompression Done");
        iFile.readFile();
    }

    @Override
    public void writeFile() {
        //..........

        iFile.writeFile();
        System.out.println("Compression Done");
    }
}
