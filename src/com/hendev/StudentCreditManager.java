package com.hendev;

public class StudentCreditManager extends BaseCreditManager{
    public double CalculateNew(double amount) {
        System.out.println("Extended Classes are Default Overridable");
        System.out.println("CalculateNew Credit Calculated.");
        return amount * 1.10;
    }

    //Final base methods cannot be overridable
    /*    public double CalculatedFinal(double amount) {
        System.out.println("CalculateNew Credit Calculated.");
        return amount * 1.50;
    }*/
}
