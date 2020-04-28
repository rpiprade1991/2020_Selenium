package com.api.methods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDemo {

    public static void main (String [] args){

        HashMap<Integer,String> h = new HashMap();
        h.put(1,"One");
        h.put(2,"Two");
        h.put(3,"Three");
        h.put(4,"Four");
        h.put(5,"Five");
        h.put(1,"One");
        h.put(2,"Two");
        h.put(3,"Threeee");

        for (Integer key : h.keySet()){

            System.out.println("Key "+key + "  Value  "+ h.get(key));
        }
        System.out.println(h.size());

       // Set<Integer> set = h.keySet();
        Iterator<Integer> it = h.keySet().iterator();
        while (it.hasNext()){


            int key = it.next();
            System.out.println("Key  "+key + " value  " + h.get(key));
        }



    }
}
