package com.example.geode.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String userId;
    private List<CartItem> items;

    public Cart() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }
}
