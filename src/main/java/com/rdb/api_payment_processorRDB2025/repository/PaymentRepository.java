package com.rdb.api_payment_processorRDB2025.repository;

import com.rdb.api_payment_processorRDB2025.domain.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByName(String name);
}
