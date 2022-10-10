package com.payment.gbpayment.service.impls;

import com.payment.gbpayment.model.Merchant;
import com.payment.gbpayment.repository.MerchantRepository;
import com.payment.gbpayment.service.IMerchantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MerchantService implements IMerchantService {
    @Autowired
    private MerchantRepository merchantRepository;


    @Override
    public List<Merchant> getAllMerchant() {
        return this.merchantRepository.findAll();
    }

    @Override
    public Merchant getMerchantById(Long id) {
        return this.merchantRepository.findById(id).get();
    }

    @Override
    public Merchant createMerchant(Merchant merchant) {
        return this.merchantRepository.save(merchant);
    }

}
