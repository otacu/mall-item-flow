package com.egoist.mall.item.flow.pojo;

import java.util.Date;

public class Spu {
    private Long id;

    private String cnName;

    private Long brandId;

    private Long originCountryId;

    private Long productionCountryId;

    private Long categoryId;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName == null ? null : cnName.trim();
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getOriginCountryId() {
        return originCountryId;
    }

    public void setOriginCountryId(Long originCountryId) {
        this.originCountryId = originCountryId;
    }

    public Long getProductionCountryId() {
        return productionCountryId;
    }

    public void setProductionCountryId(Long productionCountryId) {
        this.productionCountryId = productionCountryId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}