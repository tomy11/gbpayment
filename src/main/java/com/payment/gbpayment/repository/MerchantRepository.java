package com.payment.gbpayment.repository;

import com.payment.gbpayment.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
