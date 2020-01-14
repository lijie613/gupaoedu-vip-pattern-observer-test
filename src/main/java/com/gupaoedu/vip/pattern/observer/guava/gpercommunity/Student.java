package com.gupaoedu.vip.pattern.observer.guava.gpercommunity;

public class Student {
    private String name = "GPer生态圈";
    private String nickName;

    public Student(String nickName) {
        this.nickName = nickName;
    }

    public void publishQuestion(GPQuestion question) {
        System.out.println(question.getUsername() + "在" + this.name + "上提交了一个问题");
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }
}
