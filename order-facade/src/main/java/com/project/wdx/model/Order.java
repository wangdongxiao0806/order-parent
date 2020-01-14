package com.project.wdx.model;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Order implements Serializable{

    private Long id;

    private String userId;

    private String commodityCode;

    private int count;

    private BigDecimal money;

}