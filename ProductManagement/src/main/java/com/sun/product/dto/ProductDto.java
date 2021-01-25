package com.sun.product.dto;


import javax.persistence.Column;
import java.util.Date;

public class ProductDto {


    private Integer productId;

    private Long productNo;

    private String productName;

    private Double productPrice;

    private  Boolean isAvail;

    private Integer totalUnit;

    private Integer soldUnit;

    private Integer leftUnit;

    private Date createdDate;

    private Date modifiedDate;

    private String color;

    private String createdBy;

    private String modifiedBy;

    private Boolean isOffers;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Long getProductNo() {
        return productNo;
    }

    public void setProductNo(Long productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Boolean getAvail() {
        return isAvail;
    }

    public void setAvail(Boolean avail) {
        isAvail = avail;
    }

    public Integer getTotalUnit() {
        return totalUnit;
    }

    public void setTotalUnit(Integer totalUnit) {
        this.totalUnit = totalUnit;
    }

    public Integer getSoldUnit() {
        return soldUnit;
    }

    public void setSoldUnit(Integer soldUnit) {
        this.soldUnit = soldUnit;
    }

    public Integer getLeftUnit() {
        return leftUnit;
    }

    public void setLeftUnit(Integer leftUnit) {
        this.leftUnit = leftUnit;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Boolean getOffers() {
        return isOffers;
    }

    public void setOffers(Boolean offers) {
        isOffers = offers;
    }
}
