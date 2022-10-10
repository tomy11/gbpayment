package com.payment.gbpayment.service;

import com.payment.gbpayment.model.Merchant;

import java.util.List;

public interface IMerchantService {
    public List<Merchant> getAllMerchant();
    public Merchant getMerchantById(Long id);
    public Merchant createMerchant(Merchant merchant);
    public Merchant updateMerchant(Merchant merchant, Long id);
}
