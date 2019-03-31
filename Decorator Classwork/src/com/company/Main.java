package com.company;

public class Main {

    public static void main(String[] args) {

        IFile file = new PasswordProtected(new EncriptedFile(new CompressedFile(new File())));
        file.writeFile();
        file.readFile();
    }
}
