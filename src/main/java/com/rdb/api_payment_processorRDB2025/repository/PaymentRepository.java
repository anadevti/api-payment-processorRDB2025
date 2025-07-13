package com.rdb.api_payment_processorRDB2025.repository;

import com.rdb.api_payment_processorRDB2025.domain.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
