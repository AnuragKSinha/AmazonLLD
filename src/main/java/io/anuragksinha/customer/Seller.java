package io.anuragksinha.customer;
import io.anuragksinha.enums.OrderStatus;
import io.anuragksinha.pojo.Order;
import io.anuragksinha.pojo.Product;

public class Seller extends Member {
    public boolean addProduct(Product product){
        return true;
    }
    public boolean removeProduct(Product product){
        return true;
    }
    public OrderStatus placeOrder(Order order,String userName) {
        return OrderStatus.INITIATED;
    }

    public void checkout() {

    }
}
