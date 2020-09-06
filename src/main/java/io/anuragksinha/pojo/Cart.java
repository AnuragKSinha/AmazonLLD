package io.anuragksinha.pojo;

import java.util.List;

public class Cart {
    private List<Item> Items;
    public boolean addToCart(Item item){
        return true;
    }
    public boolean removeFromCart(Item item){
        return true;
    }
    public boolean updateItemQuantity(Item item,int quantity){
        return true;
    }
    public List<Item> getItems(){
        return Items;
    }
}
