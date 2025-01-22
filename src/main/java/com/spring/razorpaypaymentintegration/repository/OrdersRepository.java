package com.spring.razorpaypaymentintegration.repository;

import com.spring.razorpaypaymentintegration.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
