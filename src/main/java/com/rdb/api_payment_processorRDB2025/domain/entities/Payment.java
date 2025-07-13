package com.rdb.api_payment_processorRDB2025.domain.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table (name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "value")
    BigDecimal value;
}
