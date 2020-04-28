package com.electricityBillFactoryPattern;

public class FactoryGenerator {

    public Plan getBillAmount(String Plan){
          if(Plan.equals(null)){
            return null;
        }
        else if(Plan.equals("DomesticPlan")){
            return new DomesticPlan();
        }else if (Plan.equals("CommecialPlan")){
           return new CommercialPlan();
        }else if (Plan.equals("IndustrialPlan")){
         return  new IndustrialPlan();
        }
        return null;
    }
}
