package com.example.postgres.controllers;

import com.example.postgres.models.Cart;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionController {

    @PostMapping("/write")
    public ResponseEntity<String> writeSession(@RequestBody Cart cart, HttpSession session) {
        session.setAttribute(cart.getUserId(), cart);
        return ResponseEntity.ok("Cart updated!");
    }

    @GetMapping("/read")
    public ResponseEntity<Cart> readSession(@RequestParam String id, HttpSession session) {
        Cart retrievedCart = (Cart) session.getAttribute(id);
        if (retrievedCart == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(retrievedCart);
    }
}
