package com.spring.razorpaypaymentintegration.controller;

import com.spring.razorpaypaymentintegration.configuration.RazorpayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigController {

    @Autowired
    private RazorpayConfig razorpayCofig;

    @GetMapping("/client/api/config")
    public Map<String, String> getConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("razorpayPublicApiKey", razorpayCofig.getRazorpayPublicApiKey());
        return config;
    }
}
