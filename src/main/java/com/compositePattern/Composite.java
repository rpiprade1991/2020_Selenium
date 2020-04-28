package com.compositePattern;

import java.util.ArrayList;
import java.util.List;

 class  Composite implements Component {

    String name;
    List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        super();
        this.name = name;
    }


    public void addComponents(Component com) {
        components.add(com);

    }

    @Override
    public void price() {

         System.out.println("name "+name);
         for(Component c : components){
             System.out.println();
             c.price();
         }

    }
}
