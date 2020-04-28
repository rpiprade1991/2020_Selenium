package com.electricityBillFactoryPattern;

public class BillGenerator {

    public static void main  (String [] args){

FactoryGenerator Fact = new FactoryGenerator();
Plan p =Fact.getBillAmount("DomesticPlan");
p.rate();
p.calculateBill(5);
    }
}
