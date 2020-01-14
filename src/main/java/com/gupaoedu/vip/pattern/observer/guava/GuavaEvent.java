package com.gupaoedu.vip.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {


    @Subscribe
    public void subsribe(String str) {
        // 业务逻辑
        System.out.println("执行 subscribe 方法,传入的参数是:" + str);
    }
}
