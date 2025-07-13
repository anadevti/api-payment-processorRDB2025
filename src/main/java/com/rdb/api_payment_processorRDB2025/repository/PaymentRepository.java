package com.rdb.api_payment_processorRDB2025.repository;

import com.rdb.api_payment_processorRDB2025.domain.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByName(String name);
}
