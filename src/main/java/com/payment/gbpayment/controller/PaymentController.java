package com.payment.gbpayment.controller;

import com.payment.gbpayment.model.Merchant;
import com.payment.gbpayment.model.Payment;
import com.payment.gbpayment.service.impls.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/save")
    public Payment savePayment(@RequestBody Payment body){
        return this.paymentService.createPayment(body);
    }

    @GetMapping("/list")
    public List<Payment> getAllPayment(){
        return this.paymentService.getAllPayment();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(Long id) {
        return this.paymentService.getPaymentById(id);
    }

}
