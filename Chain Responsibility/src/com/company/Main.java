package com.company;

public class Main {

    public static void main(String[] args) {
	    String op = "power";

	    IOperation operation = new Addition().addNext(new Subtraction().addNext(new Multiplication().addNext(new Division().addNext(new NullOperation()))));
	    operation.calculate(op);
    }
}
