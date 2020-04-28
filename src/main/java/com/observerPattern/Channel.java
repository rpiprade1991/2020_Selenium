package com.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Observer> sub = new ArrayList<>();
    String title;

    @Override
    public void addSubscriber(Observer s) {
        sub.add(s);
    }

    @Override
    public void removeSubscriber(Observer s) {
     sub.remove(s);
    }



    @Override
    public void notifySubscriber() {
        for (Observer s1 : sub) {
            s1.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title=title;
        notifySubscriber();
    }

}
