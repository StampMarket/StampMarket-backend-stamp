package com.stamp.dao;

import com.stamp.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Integer> {

}
