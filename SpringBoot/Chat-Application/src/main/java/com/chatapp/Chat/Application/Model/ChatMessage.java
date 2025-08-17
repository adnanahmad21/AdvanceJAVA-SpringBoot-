package com.chatapp.Chat.Application.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

public class ChatMessage {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    private Long id;
    private String sender;
    private String  content;

}
