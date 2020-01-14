package com.gupaoedu.vip.pattern.observer.events.core;

import java.lang.reflect.Method;

/**
 * 监听器的一种包装,标准事件源格式的定义
 */
public class Event {
    // 事件源，事件是由谁发起的保存起来——实际上就是监听器本身（Listener）
    private Object source;
    // 事件触发，要通知谁——实际上就是包含回调函数的类
    private Object target;
    // 事件触发，要做什么动作——回调函数
    private Method callback;
    // 事件的名称，触发的是什么动作
    private String trigger;
    // 事件触发的时间
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public Method getCallback() {
        return callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{\n");
        sb.append("\tsource=").append(source.getClass());
        sb.append(",\n\ttarget=").append(target.getClass());
        sb.append(",\n\tcallback=").append(callback);
        sb.append(",\n\ttrigger='").append(trigger).append('\'');
        sb.append(",\n\ttime=").append(time);
        sb.append("\n}");
        return sb.toString();
    }
}
