package com.payment.gbpayment.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "merchant")
@Data
public class Merchant implements Serializable {

    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @JsonProperty("amount")
    @Basic
    @Column(name = "amount")
    private Float amount;

    @JsonProperty("referenceNo")
    @Basic
    @Column(name = "reference_no")
    private String referenceNo;

    @JsonProperty("gbpReferenceNo")
    @Basic
    @Column(name = "gbp_reference_no")
    private String gbpReferenceNo;

    @JsonProperty("resultCode")
    @Basic
    @Column(name = "result_code")
    private String resultCode;

    @JsonProperty("date")
    @Basic
    @Column(name = "date")
    private String date;

    @JsonProperty("time")
    @Basic
    @Column(name = "time")
    private String time;
    @JsonProperty("currencyCode")
    @Basic
    @Column(name = "currency_code")
    private String currencyCode;
    @JsonProperty("detail")
    @Basic
    @Column(name = "detail")
    private String detail;
    @JsonProperty("customerName")
    @Basic
    @Column(name = "customer_name")
    private String customerName;

    @JsonProperty("customerEmail")
    @Basic
    @Column(name = "customer_email")
    private String customerEmail;

    @JsonProperty("merchantDefined1")
    @Basic
    @Column(name = "merchant_defined1", nullable = true)
    private String merchantDefined1;

    @JsonProperty("merchantDefined2")
    @Basic
    @Column(name = "merchant_defined2", nullable = true)
    private String merchantDefined2;

    @JsonProperty("merchantDefined3")
    @Basic
    @Column(name = "merchant_defined3", nullable = true)
    private String merchantDefined3;

    @JsonProperty("merchantDefined4")
    @Basic
    @Column(name = "merchant_defined4", nullable = true)
    private String merchantDefined4;

    @JsonProperty("merchantDefined5")
    @Basic
    @Column(name = "merchant_defined5", nullable = true)
    private String merchantDefined5;

    @JsonProperty("customerTelephone")
    @Basic
    @Column(name = "customer_telephone", nullable = true)
    private Integer customerTelephone;

    @JsonProperty("customerAddress")
    @Basic
    @Column(name = "customer_address", nullable = true)
    private String customerAddress;

    @JsonProperty("retryFlag")
    @Basic
    @Column(name = "retry_flag", nullable = true)
    private String retryFlag;

    @JsonProperty("createdDate")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    @Column(name = "created_date")
    private Date createdDate;

    @JsonProperty("updatedDate")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    @Column(name = "updated_date")
    private Date updatedDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getGbpReferenceNo() {
        return gbpReferenceNo;
    }

    public void setGbpReferenceNo(String gbpReferenceNo) {
        this.gbpReferenceNo = gbpReferenceNo;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getMerchantDefined1() {
        return merchantDefined1;
    }

    public void setMerchantDefined1(String merchantDefined1) {
        this.merchantDefined1 = merchantDefined1;
    }

    public String getMerchantDefined2() {
        return merchantDefined2;
    }

    public void setMerchantDefined2(String merchantDefined2) {
        this.merchantDefined2 = merchantDefined2;
    }

    public String getMerchantDefined3() {
        return merchantDefined3;
    }

    public void setMerchantDefined3(String merchantDefined3) {
        this.merchantDefined3 = merchantDefined3;
    }

    public String getMerchantDefined4() {
        return merchantDefined4;
    }

    public void setMerchantDefined4(String merchantDefined4) {
        this.merchantDefined4 = merchantDefined4;
    }

    public String getMerchantDefined5() {
        return merchantDefined5;
    }

    public void setMerchantDefined5(String merchantDefined5) {
        this.merchantDefined5 = merchantDefined5;
    }

    public Integer getCustomerTelephone() {
        return customerTelephone;
    }

    public void setCustomerTelephone(Integer customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getRetryFlag() {
        return retryFlag;
    }

    public void setRetryFlag(String retryFlag) {
        this.retryFlag = retryFlag;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
