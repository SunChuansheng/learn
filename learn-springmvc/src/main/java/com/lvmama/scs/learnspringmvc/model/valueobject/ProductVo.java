package com.lvmama.scs.learnspringmvc.model.valueobject;

import java.math.BigDecimal;

/**
 * 产品类
 * Created by sunchuansheng on 2016/1/8.
 */
public class ProductVo {

    private String name;
    private String description;
    private BigDecimal price;

    public ProductVo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
