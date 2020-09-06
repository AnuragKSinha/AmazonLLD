package io.anuragksinha.pojo;

import io.anuragksinha.enums.AccountStatus;

import java.util.List;

public class Account {
    private String name;
    private String email;
    private String user_name;
    private String password;
    private List<Address> shippingAddress;
    private List<CreditCard> creditCards;
    private AccountStatus status;

    public boolean resetPassword(){
        return true;
    }

    public String getUserName() {
        return user_name;
    }
}
