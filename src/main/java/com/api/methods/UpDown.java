package com.api.methods;

public class UpDown {


    public static void main(String args[]) {

        int upCount =0;
        int downCount =0;
        int valley =0;
        int mountain =0;

        String s = "UDDDUDUU";  //UD DDUDUU
        String [] a = s.split("");
   boolean ground =  true ;
        for (int i =0 ; i< a.length;i++){

           if(a[i].equals("U")){
               upCount ++;
               ground =  true;
           }
            if(a[i].equals("D")){
                downCount++;
                ground =  false;
            }
            if((upCount-downCount==0 )&& ( ground ==  true)){

                 valley++;
                downCount=0;
                upCount=0;

                }if(upCount-downCount==0 ){
                downCount=0;
                upCount=0;
            }

            }

        System.out.println("mountain  "+mountain);
        System.out.println("valley  "+valley);
        }




    }

