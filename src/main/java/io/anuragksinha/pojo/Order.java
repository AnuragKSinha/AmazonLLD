package io.anuragksinha.pojo;

import io.anuragksinha.enums.*;
import io.anuragksinha.service.MailNotificationService;
import io.anuragksinha.service.NotificationService;
import io.anuragksinha.service.SMSNotificationService;

import java.util.List;

import static io.anuragksinha.enums.NotificationType.*;

public class Order {
    private String order_id;
    private List<Item> Items;
    private OrderStatus orderStatus;
    private Notification notification;
    private NotificationService notificationService;

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public PaymentStatus makePayment(PaymentMode mode){
        return PaymentStatus.FAIL;
    }
    public ShippingStatus proceedToShipment(){
        return ShippingStatus.DELIVERED;
    }
    public OrderStatus trackOrder(Order order){
        return OrderStatus.PENDING;
    }
    public void addItems(Item item){
        Items.add(item);
    }
    public void sendNotification(){
        switch(notification.getType()){
            case MAIL:
                notificationService=new MailNotificationService();
                notificationService.sendNotification(notification);
                break;
            default:
                notificationService=new SMSNotificationService();
                notificationService.sendNotification(notification);
                break;

        }

    }

}
