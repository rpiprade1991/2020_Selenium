package com.observerPattern;

public interface Observer {
    void subscribeChannel(Channel ch);

    void update();
}
