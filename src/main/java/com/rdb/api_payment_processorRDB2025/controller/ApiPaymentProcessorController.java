package com.rdb.api_payment_processorRDB2025.controller;

import com.rdb.api_payment_processorRDB2025.domain.entities.Payment;
import com.rdb.api_payment_processorRDB2025.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payment-processor")
@RequiredArgsConstructor
public class ApiPaymentProcessorController {
    private final PaymentRepository paymentRepository;

    @GetMapping
    public List<Payment> findAllPayments(){
        return paymentRepository.findAll();
    }
    @GetMapping("/findPaymentByName")
    public List<Payment> findPaymentByName(@RequestParam String name){
        return paymentRepository.findByName(name);
    }
}