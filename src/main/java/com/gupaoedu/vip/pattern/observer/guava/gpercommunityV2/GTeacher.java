package com.gupaoedu.vip.pattern.observer.guava.gpercommunityV2;

import com.google.common.eventbus.Subscribe;

public class GTeacher {
    private String name;

    public GTeacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void acceptQuestion(GQuestion question) {
        System.out.println("=====================================================");
        System.out.println(this.name + "老师，你好！\n" +
                "您收到了一个来自\"" + question.getCommunityName() + "\"的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUsername());
    }
}
