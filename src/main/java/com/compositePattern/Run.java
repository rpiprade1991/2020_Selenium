package com.compositePattern;

public class Run {

    public static void main(String[] args) {
        Component hd = new Leaf("HDD",5000);
        Component ram = new Leaf("RAM",4000);
        Component wifi = new Leaf("WIFI",1000);
        Component bt = new Leaf("BT",300);
        Component mouse = new Leaf("MOUSE",100);
        Component monitor = new Leaf("MONITOR",11000);
        Component cpu = new Leaf("CPU",30000);

        Composite ph = new Composite("Periferal");
        Composite computer = new Composite("Computer");
        Composite  cabinet = new Composite("Cabinet");

        ph.addComponents(mouse);
        ph.addComponents(monitor);
        ph.addComponents(cpu);

        cabinet.addComponents(hd);
        cabinet.addComponents(ram);
        cabinet.addComponents(wifi);
        cabinet.addComponents(bt);

        computer.addComponents(ph);
        computer.addComponents(cabinet);

        computer.price();




    }
}
