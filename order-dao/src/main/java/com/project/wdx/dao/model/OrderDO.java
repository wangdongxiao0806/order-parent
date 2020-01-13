package com.project.wdx.dao.model;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "order_tbl")
public class OrderDO {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "commodity_code")
    private String commodityCode;

    @Column(name = "count")
    private int count;
    @Column(name = "money")
    private BigDecimal money;

}
