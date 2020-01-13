package com.project.wdx.model;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private Long id;

    private String userId;

    private String commodityCode;

    private int count;

    private BigDecimal money;

}