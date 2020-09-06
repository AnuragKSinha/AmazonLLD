package io.anuragksinha.customer;

import io.anuragksinha.enums.NotificationType;
import io.anuragksinha.enums.OrderStatus;
import io.anuragksinha.enums.PaymentMode;
import io.anuragksinha.enums.PaymentStatus;
import io.anuragksinha.pojo.Item;
import io.anuragksinha.pojo.Notification;
import io.anuragksinha.pojo.Order;

import java.util.List;

public class Buyer extends Member {
    public OrderStatus placeOrder(Order order,String user_Name) {
        PaymentStatus paymentStatus = order.makePayment(PaymentMode.CREDIT_CARD);
        if(paymentStatus.equals(PaymentStatus.SUCCESS)) {
            order.proceedToShipment();
            order.setNotification(new Notification().addMember(this).addType(NotificationType.MAIL).addMessageBody("Order is Initiated"));
        }
        else
            return OrderStatus.PENDING;
        return OrderStatus.INITIATED;
    }
    public void checkout() {
        order = new Order();
        List<Item> items= cart.getItems();
        for(Item item : items){
            order.addItems(item);
        }
        placeOrder(order,this.getAccount().getUserName());
    }
}
