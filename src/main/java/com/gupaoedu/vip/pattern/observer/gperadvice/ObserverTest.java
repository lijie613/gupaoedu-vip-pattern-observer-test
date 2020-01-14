package com.gupaoedu.vip.pattern.observer.gperadvice;

public class ObserverTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();

        // 业务逻辑代码
        Question question = new Question();
        question.setUsername("农夫的一天");
        question.setContent("观察者模式用于那些场景？");

        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        gPer.addObserver(tom);
        gPer.addObserver(mic);
        gPer.publishQuestion(question);
    }
}
