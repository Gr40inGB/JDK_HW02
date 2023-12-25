package org.gr40in.core.message;

import java.time.LocalDateTime;

public class Message {
    boolean systemMessage;
    LocalDateTime sendMoment;
    User sender;
    String data;

    public Message(User sender, String data) {
        this.sender = sender;
        this.data = data;
    }

    public Message(boolean systemMessage, LocalDateTime sendMoment, User sender, String data) {
        this.systemMessage = systemMessage;
        this.sendMoment = sendMoment;
        this.sender = sender;
        this.data = data;
    }
}
