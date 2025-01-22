package com.spring.razorpaypaymentintegration.service;

import com.spring.razorpaypaymentintegration.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrdersRepository ordersRepository;


}
