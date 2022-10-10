package com.payment.gbpayment.controller;

import com.payment.gbpayment.model.Merchant;
import com.payment.gbpayment.service.impls.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @PostMapping("/save")
    public Merchant saveMerchante(@RequestBody Merchant body){
        return this.merchantService.createMerchant(body);
    }

    @GetMapping("/list")
    public List<Merchant> getAllMerchante() {
        return this.merchantService.getAllMerchant();
    }

    @GetMapping("/{id}")
    public Merchant getMerchanteById(Long id) {
        return this.merchantService.getMerchantById(id);
    }

}
