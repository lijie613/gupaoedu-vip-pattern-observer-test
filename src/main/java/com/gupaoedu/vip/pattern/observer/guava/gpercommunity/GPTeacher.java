package com.gupaoedu.vip.pattern.observer.guava.gpercommunity;

import com.google.common.eventbus.EventBus;

public class GPTeacher {
    private String name;
    private String studentName;

    public GPTeacher(String name, String studentName) {
        this.name = name;
        this.studentName = studentName;
    }

    public void receiveQuestion(GPQuestion question) {
        System.out.println("=====================================================");
        System.out.println(this.name + "老师，你好！\n" +
                "您收到了一个来自\"" + studentName + "\"的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUsername());
    }

}
