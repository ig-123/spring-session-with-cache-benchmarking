package com.example.geode.models;

import java.io.Serial;
import java.io.Serializable;

public class CartItem implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String itemId;
    private String itemName;
    private int quantity;
    private double price;

    public CartItem() {
    }


    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
