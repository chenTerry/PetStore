package com.terry.jpetstore.dao;

import com.terry.jpetstore.domain.OrderDetail;

import java.util.List;

public interface OrderDetailDao {

    //查询所有订单细节
    List<OrderDetail> findAll();

    //创建订单明细
    int create(OrderDetail orderdetail);

    //修改明细
    int modify_(OrderDetail orderdetail);

    //删除明细
    int remove(OrderDetail orderdetail);
}
