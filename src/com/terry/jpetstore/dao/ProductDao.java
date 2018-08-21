package com.terry.jpetstore.dao;

import com.terry.jpetstore.domain.Product;

import java.util.List;

public interface ProductDao {
    //查询所有商品
    List<Product> findAll();

    //创建商品
    int create(Product product);

    //修改商品
    int modify_(Product product);

    //删除商品
    int remove(Product product);
}
