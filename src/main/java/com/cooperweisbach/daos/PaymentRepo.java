package com.cooperweisbach.daos;

import com.cooperweisbach.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {
}
