package com.github.checkmaathy.controllers;

import com.github.checkmaathy.models.OrderRequestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @PostMapping("/order")
    public String makeOrder(@RequestBody OrderRequestDTO orderRequest) {
        return orderRequest.clientName();
    }

    @GetMapping("/{clientId}")
    public String listOrders(@PathVariable(name = "clientId") String clientId) {
        return clientId;
    }

}
