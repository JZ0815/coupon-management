package com.jie.trade.coupon.db.mappers;

import com.jie.trade.coupon.db.model.Coupon;

public interface CouponMapper {
    int insert(Coupon record);

    int insertSelective(Coupon record);
}