package com.project.wdx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.project.wdx.dao.OrderDAO;
import com.project.wdx.dao.model.OrderDO;
import com.project.wdx.facade.OrderService;
import com.project.wdx.model.Order;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    public Boolean create(Order order) {

        OrderDO orderDO = new OrderDO();
        BeanUtils.copyProperties(order,orderDO);
        orderDAO.save(orderDO);
        return true;
    }
}
