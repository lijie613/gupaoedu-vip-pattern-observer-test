package com.gupaoedu.vip.pattern.observer.guava.gpercommunityV2;

import com.google.common.eventbus.EventBus;
import com.gupaoedu.vip.pattern.observer.gperadvice.Question;

public class GPerQuestionTest {
    public static void main(String[] args) {
        GQuestion question = new GQuestion(
                "农夫的一天",
                "用Guava如何实现GPer社区提问题通知场景？",
                "GPer社区");

        GTeacher tom = new GTeacher("Tom");
        GTeacher mic = new GTeacher("Mic");
        EventBus eventBus = new EventBus();
        eventBus.register(tom);
        eventBus.register(mic);
        eventBus.post(question);

    }
}
