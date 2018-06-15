package com.xsp.manager.mapper;

import com.xsp.manager.domain.Seller;

public interface SellerMapper {
    int deleteByPrimaryKey(Integer sellerId);

    int insert(Seller record);

    int insertSelective(Seller record);

    Seller selectByPrimaryKey(Integer sellerId);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}