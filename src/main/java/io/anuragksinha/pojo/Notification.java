package io.anuragksinha.pojo;

import io.anuragksinha.customer.Member;
import io.anuragksinha.enums.NotificationType;

public class Notification {
    Member member;
    NotificationType type;
    String messageBody;

    public NotificationType getType() {
        return type;
    }

    public Notification() {
    }
    public Notification addMember(Member member){
        this.member=member;
       return this;
    }
    public Notification addType(NotificationType type){
        this.type=type;
        return this;
    }
    public Notification addMessageBody(String messageBody){
        this.messageBody=messageBody;
        return this;
    }
}
