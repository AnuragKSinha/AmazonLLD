package io.anuragksinha.service;

import io.anuragksinha.pojo.Message;
import io.anuragksinha.pojo.Notification;
import io.anuragksinha.pojo.Order;

public interface NotificationService {
    public boolean sendNotification(Notification notification);
}
