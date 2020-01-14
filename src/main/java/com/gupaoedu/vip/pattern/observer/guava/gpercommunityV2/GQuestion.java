package com.gupaoedu.vip.pattern.observer.guava.gpercommunityV2;

public class GQuestion {
    private String content;

    private String username;

    private String communityName;

    public GQuestion(String username, String content, String communityName) {
        this.content = content;
        this.username = username;
        this.communityName = communityName;
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

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
}
