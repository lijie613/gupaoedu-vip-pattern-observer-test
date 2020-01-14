package com.gupaoedu.vip.pattern.observer.guava.gpercommunity;

import com.google.common.eventbus.Subscribe;

public class GPEvent {
    private GPQuestion question;
    private GPTeacher teacher;

    public GPEvent(GPTeacher teacher, GPQuestion question) {
        this.teacher = teacher;
        this.question = question;
    }

    @Subscribe
    public void subscribe(Student student) {
        student.publishQuestion(question);
        teacher.receiveQuestion(question);

    }

    public GPQuestion getQuestion() {
        return question;
    }

    public void setQuestion(GPQuestion question) {
        this.question = question;
    }

}
