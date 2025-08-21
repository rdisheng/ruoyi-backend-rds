package com.ruoyi.ai.domain.dto;

import lombok.Data;

// Message.java
@Data
public class Message {
    private String role;
    private String content;

    // getter & setter
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

