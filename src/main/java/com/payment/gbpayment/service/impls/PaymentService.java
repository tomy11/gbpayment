package com.payment.gbpayment.service.impls;

import com.google.gson.Gson;
import com.payment.gbpayment.common.GbConfiguration;
import com.payment.gbpayment.helper.RestClientHelper;
import com.payment.gbpayment.model.Payment;
import com.payment.gbpayment.repository.PaymentRepository;
import com.payment.gbpayment.service.IPaymentService;
import lombok.extern.log4j.Log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import okhttp3.*;
import okhttp3.MediaType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Log4j
@Service
public class PaymentService implements IPaymentService {
    private final String dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(15)));
    private final Logger logger = LogManager.getLogger(PaymentService.class);
    @Autowired
    private GbConfiguration gbConfiguration;
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private RestClientHelper restClientHelper;

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
        Payment body = new Payment();
        body.setAmount(payment.getAmount());
        body.setReferenceNo(payment.getReferenceNo());
        body.setBackgroundUrl(payment.getBackgroundUrl());
        body.setDetail(payment.getDetail());
        body.setCustomerName(payment.getCustomerName());
        body.setCustomerEmail(payment.getCustomerEmail());
        body.setMerchantDefined1(payment.getMerchantDefined1());
        body.setMerchantDefined2(payment.getMerchantDefined2());
        body.setMerchantDefined3(payment.getMerchantDefined3());
        body.setMerchantDefined4(payment.getMerchantDefined4());
        body.setMerchantDefined5(payment.getMerchantDefined5());
        body.setCustomerTelephone(payment.getCustomerTelephone());
        body.setCustomerAddress(payment.getCustomerAddress());
        body.setOrderAcknowledge(payment.getOrderAcknowledge());
        body.setUserId(payment.getUserId());
        body.setImageName(payment.getImageName());
        body.setImageUrl(payment.getImageUrl());
        body.setStatus(payment.getStatus());
        body.setStatusMessage(payment.getStatusMessage());
        body.setTimeOut(dateFormat);
        body.setGbpReferenceNo(payment.getGbpReferenceNo());
        body.setCreatedDate(new java.util.Date());
        body.setUpdatedDate(payment.getUpdatedDate());
        logger.info("update payment success");
        return this.paymentRepository.save(body);
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
        result.setUpdatedDate(new Date());
        this.paymentRepository.save(result);
        logger.info("update payment success");
        Payment target = this.getPaymentById(id);
        return target;
    }

    private HttpEntity<byte[]> callPaymentApi(Payment data){
        Gson gson = new Gson();
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, gson.toJson(data));


        return null;
    }

    private HashMap<String, Object> createPayload(Payment body) {
        HashMap<String, Object> payload = new HashMap<>();
        payload.put("token", gbConfiguration.getGbApiToken());
        payload.put("amount", body.getAmount());
        payload.put("referenceNo", body.getReferenceNo());
        payload.put("backgroundUrl", body.getBackgroundUrl());
        payload.put("detail", body.getDetail());
        payload.put("customerName", body.getCustomerName());
        payload.put("customerEmail", body.getCustomerEmail());
        payload.put("merchantDefined1", body.getMerchantDefined1());
        payload.put("merchantDefined2", body.getMerchantDefined2());
        payload.put("merchantDefined3", body.getMerchantDefined3());
        payload.put("merchantDefined4", body.getMerchantDefined4());
        payload.put("merchantDefined5", body.getMerchantDefined5());
        payload.put("customerTelephone", body.getCustomerTelephone());
        payload.put("customerAddress", body.getCustomerAddress());
        return payload;
    }

    }
