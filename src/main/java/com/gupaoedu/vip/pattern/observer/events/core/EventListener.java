package com.gupaoedu.vip.pattern.observer.events.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器，它就是观察者的桥梁
 */
public class EventListener {

    //JDK 底层的 Listener 通常也是这样来设计的
    private Map<String, Event> events = new HashMap<String, Event>();

    //事件名称和一个目标对象来触发事件
    public void addListener(String eventType, Object target) {
        try {
            this.addListener(
                    eventType,
                    target,
                    target.getClass().getMethod("on" + toUpperFirstCase(eventType), Event.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addListener(String eventType, Object target, Method callback) {
        //注册事件
        events.put(eventType, new Event(target, callback));
    }

    public void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
            // 发起回调
            if (event.getCallback() != null) {
                //用反射调用它的回调函数
                event.getCallback().invoke(event.getTarget(), event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void trigger(String trigger) {
        if (!events.containsKey(trigger)) {
            return;
        }
        this.trigger(events.get(trigger).setTrigger(trigger));
    }

    //逻辑处理的私有方法，首字母大写
    private String toUpperFirstCase(String str) {
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
