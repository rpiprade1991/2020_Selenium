package com.api.methods;

import java.util.*;
import java.util.stream.Collectors;

public class Sett {


    public static void main(String args[]) {


        int ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int count =0;
        int counter =0;
        int l = ar.length;
        for (int i =0 ; i< l ; i++){
            count =1;

            for (int j=i+1 ; j<l ; j++){
                if(ar[i]==ar[j]){
                    count ++;

                }


            }

            if (count % 2 ==0){
               counter ++;
            }
        }
System.out.println("Counter "+counter);
    }
}
