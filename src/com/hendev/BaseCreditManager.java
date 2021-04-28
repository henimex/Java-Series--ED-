package com.hendev;

public class BaseCreditManager {
    public void Calculate() {
        System.out.println("Credit Calculated.");
    }

    public double CalculateNew(double amount) {
        System.out.println("CalculateNew Credit Calculated.");
        return amount * 1.18;
    }

    public final double CalculatedFinal(double amount) {
        System.out.println("CalculateNew Credit Calculated.");
        return amount * 1.50;
    }
}
