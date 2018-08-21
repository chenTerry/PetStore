package com.terry.jpetstore.dao;

import com.terry.jpetstore.domain.Order;

import java.util.List;

public interface OrderDao {

    //查询所有订单信息
    List<Order> findAll();

    //根据主键查询
    Order findById(Order order);

    //创建订单信息
    int create(Order order);

    //修改订单信息
    int modify(Order order);

    //删除订单信息
    int remove(Order order);

}
