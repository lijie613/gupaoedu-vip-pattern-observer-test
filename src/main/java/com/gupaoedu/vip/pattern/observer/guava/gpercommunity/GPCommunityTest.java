package com.gupaoedu.vip.pattern.observer.guava.gpercommunity;

import com.google.common.eventbus.EventBus;

public class GPCommunityTest {
    public static void main(String[] args) {
        Student student = new Student("农夫的一天");
        GPQuestion question = new GPQuestion(student.getNickName(), "用Guava如何实现GPer社区提问题通知场景？");
        GPTeacher teacher = new GPTeacher("Tom", student.getNickName());
        GPEvent event = new GPEvent(teacher, question);


        EventBus eventBus = new EventBus();
        eventBus.register(event);
        eventBus.post(student);
    }
}
