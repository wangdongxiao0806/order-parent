package com.project.wdx.dao;

import com.project.wdx.dao.model.OrderDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface OrderDAO extends JpaRepository<OrderDO,Long> {
}
