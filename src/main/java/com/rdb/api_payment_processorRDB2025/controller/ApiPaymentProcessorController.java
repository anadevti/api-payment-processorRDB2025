package com.rdb.api_payment_processorRDB2025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment-processor")
public class ApiPaymentProcessorController {
    @GetMapping
    public String testcontroller(){
        return "Hello, Rinha!";
    }
    @GetMapping("/test2")
    public String testcontroller2(){
        return "Hello, Backender!";
    }
}