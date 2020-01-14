package com.gupaoedu.vip.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {
        GuavaEvent guavaEvent = new GuavaEvent();

        // 消息总线
        EventBus eventBus = new EventBus();
        // 注册
        eventBus.register(guavaEvent);
        eventBus.post("农夫的一天");

    }
}
