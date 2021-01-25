package com.sun.product.Entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Product",schema = "dev")
public class ProductEntiry {
    @Id()
//    GenerationType()
    @Column(name = "productId")
    private Integer productId;
    @Column(name = "productNo")
    private Long productNo;
    @Column(name = "pName")
    private String productName;
    @Column(name = "price")
    private Double productPrice;
    @Column(name = "isAvail")
    private  Boolean isAvail;
    @Column(name = "totalUnit")
    private Integer totalUnit;
    @Column(name = "soldUnit")
    private Integer soldUnit;
    @Column(name = "remaining")
    private Integer leftUnit;
    @Column(name = "createdDate")
    private Date createdDate;
    @Column(name = "modifiedDate")
    private Date modifiedDate;
    @Column(name = "color")
    private String color;
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "modifiedBy")
    private String modifiedBy;
    @Column(name = "isOffers")
    private Boolean isOffers;



    public ProductEntiry() {
    }

    public ProductEntiry(Integer productId, Long productNo, String productName, Double productPrice, Boolean isAvail, Integer totalUnit, Integer soldUnit, Integer leftUnit, Date createdDate, Date modifiedDate, String color, String createdBy, String modifiedBy, Boolean isOffers) {
        this.productId = productId;
        this.productNo = productNo;
        this.productName = productName;
        this.productPrice = productPrice;
        this.isAvail = isAvail;
        this.totalUnit = totalUnit;
        this.soldUnit = soldUnit;
        this.leftUnit = leftUnit;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.color = color;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.isOffers = isOffers;
    }

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

    @Override
    public String toString() {
        return "ProductEntiry{" +
                "productId=" + productId +
                ", productNo=" + productNo +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", isAvail=" + isAvail +
                ", totalUnit=" + totalUnit +
                ", soldUnit=" + soldUnit +
                ", leftUnit=" + leftUnit +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", color='" + color + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", isOffers=" + isOffers +
                '}';
    }
}
