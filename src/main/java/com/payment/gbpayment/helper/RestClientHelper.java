package com.payment.gbpayment.helper;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import java.util.Map;

@Component
public class RestClientHelper {
    @Resource(name = "restTemplate")
    private RestTemplate restTemplate;

    public <T> ResponseEntity<T> get(String url, Map<String, String> params, Class<T> clazz, HttpHeaders headers) {
        try {
            return restTemplate.exchange
                    (
                            buildUrlTemplates(url, params),
                            HttpMethod.GET,
                            new HttpEntity<>(headers),
                            clazz,
                            params
                    );
        } catch (Exception exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    public <T, R> ResponseEntity<T> put(String url, R request, Class<T> clazz, HttpHeaders headers) {
        try {
            return restTemplate.exchange
                    (
                            url,
                            HttpMethod.PUT,
                            new HttpEntity<>(request, headers),
                            clazz
                    );
        } catch (Exception exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    public <T, R> ResponseEntity<T> post(String url, R request, Class<T> clazz, HttpHeaders headers) {
        try {
            return restTemplate.exchange
                    (
                            url,
                            HttpMethod.POST,
                            new HttpEntity<>(request, headers),
                            clazz
                    );
        } catch (Exception exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    public <T> ResponseEntity<T> post(String url, HttpEntity<MultiValueMap<String, String>> entity, Class<T> clazz) {
        try {
            return restTemplate.exchange
                    (
                            url,
                            HttpMethod.POST,
                            entity,
                            clazz
                    );
        } catch (Exception exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    public <T, R> ResponseEntity<T> post(String url, Map<String, String> params, R request, Class<T> clazz, HttpHeaders headers) {
        try {
            return restTemplate.exchange
                    (
                            buildUrlTemplates(url, params),
                            HttpMethod.POST,
                            new HttpEntity<>(request, headers),
                            clazz,
                            params
                    );
        } catch (Exception exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    private <T> String buildUrlTemplates(String url, Map<String, T> params) {
        UriComponentsBuilder urlTemplate = UriComponentsBuilder.fromHttpUrl(url);
        params.keySet().forEach(key -> urlTemplate.queryParam(key, String.format("{%s}", key)));
        return urlTemplate.encode().toUriString();
    }

}
