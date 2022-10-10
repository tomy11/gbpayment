package com.payment.gbpayment.service.impls;

import com.payment.gbpayment.model.Payment;
import com.payment.gbpayment.repository.PaymentRepository;
import com.payment.gbpayment.service.IPaymentService;
import lombok.extern.log4j.Log4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PaymentService implements IPaymentService {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayment() {
        return this.paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(Long id) {
        return this.paymentRepository.findById(id).get();
    }

    @Override
    public Payment createPayment(Payment payment) {
        return this.paymentRepository.save(payment);
    }

    @Override
    public Payment updatePayment(Payment body, Long id) {
        Payment result = this.paymentRepository.findById(id).get();
        result.setAmount(body.getAmount());
        result.setReferenceNo(body.getReferenceNo());
        result.setBackgroundUrl(body.getBackgroundUrl());
        result.setDetail(body.getDetail());
        result.setCustomerName(body.getCustomerName());
        result.setCustomerEmail(body.getCustomerEmail());
        result.setMerchantDefined1(body.getMerchantDefined1());
        result.setMerchantDefined2(body.getMerchantDefined2());
        result.setMerchantDefined3(body.getMerchantDefined3());
        result.setMerchantDefined4(body.getMerchantDefined4());
        result.setMerchantDefined5(body.getMerchantDefined5());
        result.setCustomerTelephone(body.getCustomerTelephone());
        result.setCustomerAddress(body.getCustomerAddress());
        result.setOrderAcknowledge(body.getOrderAcknowledge());
        result.setUserId(body.getUserId());
        result.setImageName(body.getImageName());
        result.setImageUrl(body.getImageUrl());
        result.setStatus(body.getStatus());
        result.setStatusMessage(body.getStatusMessage());
        result.setTimeOut(body.getTimeOut());
        result.setGbpReferenceNo(body.getGbpReferenceNo());
        result.setCreatedDate(body.getCreatedDate());
        result.setUpdatedDate(new java.util.Date());
        this.paymentRepository.save(result);

        Payment target = this.getPaymentById(id);
        return target;
    }
}
