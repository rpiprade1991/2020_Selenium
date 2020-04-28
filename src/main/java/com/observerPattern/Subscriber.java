package com.observerPattern;

public class Subscriber implements Observer {


    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void subscribeChannel(Channel ch){
        channel = ch;

    }

    @Override
    public void update(){
        System.out.println("Hey  " +name +" , new Video uploaded : "+ channel.title);
    }
}
