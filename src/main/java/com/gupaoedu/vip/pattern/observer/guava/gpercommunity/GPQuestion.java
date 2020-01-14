package com.gupaoedu.vip.pattern.observer.guava.gpercommunity;

public class GPQuestion {
    private String content;

    private String username;

    public GPQuestion(String username, String content) {
        this.content = content;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
