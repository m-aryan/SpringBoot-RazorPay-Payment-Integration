package com.spring.razorpaypaymentintegration.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayConfig {

    @Value("${razorpay.ID}")
    private String razorpayPublicApiKey;

    public String getRazorpayPublicApiKey(){
        return razorpayPublicApiKey;
    }

}
