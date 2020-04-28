package com.api.methods;

import java.util.ArrayList;

public class ArrayListIterator {


    public static void main (String [] args){

        ArrayList a = new ArrayList();

        a.add("First Element");
        a.add(2);
        a.add("Third element");
        a.add(4.1);
        a.add("Five");

        for (Object printable : a){ System.out.println(printable.toString()); }
        ArrayList<String> s = a;
        if (s.contains("Five")){
            System.out.println("Present " + s.size());


        }
        else{
            System.out.println("Not present");
        }


    }
}
