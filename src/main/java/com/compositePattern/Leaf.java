package com.compositePattern;

 class Leaf implements Component {
    int price;
    String name;

    public Leaf (String name, int price){
        super();
        this.name = name;
        this.price = price;
    }
    @Override
    public void price() {
        System.out.printf(name +" : "+price);

    }
}
