package com.observerPattern;

public interface Subject {
    void addSubscriber(Observer s);

    void removeSubscriber(Observer s);

    void notifySubscriber();

    void upload(String title);
}
