package com.payment.gbpayment.service;

import com.payment.gbpayment.model.Payment;

import java.util.List;

public interface IPaymentService {
    public List<Payment> getAllPayment();
    public Payment getPaymentById(Long id);
    public Payment createPayment(Payment payment);
    public Payment updatePayment(Payment payment, Long id);
}
