package com.payment.gbpayment.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class GbConfiguration {

    @Value("${Paynment.api.url}")
    private String baseUrl;

    @Value("${Paynment.api.token}")
    private String gbApiToken;

    @Value("Payment.api.secretKey")
    private String gbApiSecretKey;

    @Value("Payment.api.queryUrl")
    private String gbApiQueryUrl;

}
