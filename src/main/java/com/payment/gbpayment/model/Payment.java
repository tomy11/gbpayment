package com.payment.gbpayment.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "payment")
@Data
public class Payment implements Serializable {

    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @JsonProperty("amount")
    @Basic
    @Column(name = "amount")
    private float amount;

    @JsonProperty("referenceNo")
    @Basic
    @Column(name = "reference_no")
    private String referenceNo;

    @JsonProperty("backgroundUrl")
    @Basic
    @Column(name = "background_url", nullable = true)
    private String backgroundUrl;

    @JsonProperty("detail")
    @Basic
    @Column(name = "detail", nullable = true)
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
    private String customerTelephone;

    @JsonProperty("customerAddress")
    @Basic
    @Column(name = "customer_address", nullable = true)
    private String customerAddress;

    @JsonProperty("orderAcknowledge")
    @Basic
    @Column(name = "order_acknowledge")
    private Boolean orderAcknowledge;

    @JsonProperty("userId")
    @Basic
    @Column(name = "user_id")
    private Integer userId;

    @JsonProperty("imageName")
    @Basic
    @Column(name = "image_name", nullable = true)
    private String imageName;

    @JsonProperty("imageUrl")
    @Basic
    @Column(name = "image_url", nullable = true)
    private String imageUrl;

    @JsonProperty("status")
    @Basic
    @Column(name = "status")
    private Integer status;

    @JsonProperty("statusMessage")
    @Basic
    @Column(name = "status_message")
    private String statusMessage;

    @JsonProperty("timeout")
    @Basic
    @Column(name = "timeout")
    private String timeOut;

    @JsonProperty("gbpReferenceNo")
    @Basic
    @Column(name = "gbp_reference_no", nullable = true)
    private String gbpReferenceNo;

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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
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

    public String getCustomerTelephone() {
        return customerTelephone;
    }

    public void setCustomerTelephone(String customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Boolean getOrderAcknowledge() {
        return orderAcknowledge;
    }

    public void setOrderAcknowledge(Boolean orderAcknowledge) {
        this.orderAcknowledge = orderAcknowledge;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public String getGbpReferenceNo() {
        return gbpReferenceNo;
    }

    public void setGbpReferenceNo(String gbpReferenceNo) {
        this.gbpReferenceNo = gbpReferenceNo;
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
