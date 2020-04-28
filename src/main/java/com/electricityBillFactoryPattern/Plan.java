package com.electricityBillFactoryPattern;

public abstract class Plan {
    protected double rate;
    abstract void rate();


    public  void calculateBill(int unit){
        System.out.println("Bill "+ rate * unit);
    }
}
