package com.gupaoedu.vip.pattern.observer.events;

import com.gupaoedu.vip.pattern.observer.events.mouseevent.Mouse;
import com.gupaoedu.vip.pattern.observer.events.mouseevent.MouseEventCallback;
import com.gupaoedu.vip.pattern.observer.events.mouseevent.MouseEventType;

public class MouseEventTest {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        // 回调函数类
        MouseEventCallback callback = new MouseEventCallback();

        // 注册事件
        mouse.addListener(MouseEventType.ON_CLICK, callback);
        mouse.addListener(MouseEventType.ON_DOUBLE_CLICK, callback);

        // 调用方法
        mouse.click();
        mouse.doubleClick();
    }
}
