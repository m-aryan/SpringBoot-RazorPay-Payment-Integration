package com.spring.razorpaypaymentintegration.controller;

import com.razorpay.RazorpayException;
import com.spring.razorpaypaymentintegration.model.Orders;
import com.spring.razorpaypaymentintegration.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class OrdersController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String ordersPage() {
        return "orders";
    }

    @PostMapping(value = "/createOrder", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Orders> createOrder(@RequestBody Orders orders) throws RazorpayException {
        Orders razorpayOrder = orderService.createOrder(orders);
        return new ResponseEntity<>(razorpayOrder, HttpStatus.CREATED);
    }

    @PostMapping("/paymentCallback")
    public String paymentCallback(@RequestParam Map<String, String> response){
        orderService.updateStatus(response);
        return "success";
    }
}
