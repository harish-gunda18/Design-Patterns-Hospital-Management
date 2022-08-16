package com.edu.neu.csye7374.finalProject.models;

public class AddReceiver implements ReceiverAPI {
    private double a;
    private double b;
    private double c;

    public AddReceiver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double execute() {
        System.out.println("Printing total hospital charge: " +  (a+b+c));
        return a+b+c;
    }
}
