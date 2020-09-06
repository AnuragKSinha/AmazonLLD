package io.anuragksinha.customer;

import io.anuragksinha.enums.OrderStatus;
import io.anuragksinha.pojo.Account;
import io.anuragksinha.pojo.Order;

public abstract class Member extends Customer{
    Account account;
    public abstract OrderStatus placeOrder(Order order,String userName);
    public abstract void checkout();

    public Account getAccount() {
        return account;
    }
}
