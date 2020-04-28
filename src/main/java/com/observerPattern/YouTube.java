package com.observerPattern;

public class YouTube {
    public static void main(String[] args) {


        Subscriber s1 = new Subscriber("Rahul");
        Subscriber s2 = new Subscriber("Puja");
        Subscriber s3 = new Subscriber("IUC");
        Subscriber s4 = new Subscriber("Vishal");
        Subscriber s5 = new Subscriber("Vaidya");

        Channel BodyBuiding = new Channel();
        BodyBuiding.addSubscriber(s1);
        BodyBuiding.addSubscriber(s2);
        BodyBuiding.addSubscriber(s3);
        BodyBuiding.addSubscriber(s4);
        BodyBuiding.addSubscriber(s5);

        BodyBuiding.removeSubscriber(s3);

        s1.subscribeChannel(BodyBuiding);
        s2.subscribeChannel(BodyBuiding);
        s3.subscribeChannel(BodyBuiding);
        s4.subscribeChannel(BodyBuiding);
        s5.subscribeChannel(BodyBuiding);

        BodyBuiding.upload( "How to workOut from Home");

    }
}
