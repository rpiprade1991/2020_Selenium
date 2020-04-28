package com.api.methods;

public class Cloud {
    public static void main (String [] args){

 int c [] = {0,0,0,1,0,0};
 int jump =0;
 int l = c.length;

 for(int i=0;i<l ;i++){
if(c[i]==0) {
    if ((i + 1 < l) && (c[i + 1] == 0)) {

        if ((i + 2 < l) && (c[i + 2] == 0)) {
            jump++;
         i = i+1;
        } else {

            jump++;

        }
    } else {
        jump++;
    }
}

 }

System.out.println("jump "+jump);
    }
}
