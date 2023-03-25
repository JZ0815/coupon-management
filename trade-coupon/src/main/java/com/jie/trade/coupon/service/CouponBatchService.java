package com.jie.trade.coupon.service;

import com.jie.trade.coupon.db.model.CouponBatch;

import java.util.List;

public interface CouponBatchService {

    /**
     * 新增一个券批次
     *
     * @param couponBatch
     * @return
     */
    boolean insertCouponBatch(CouponBatch couponBatch);


    /**
     * 查询优惠券批次列表
     * @return
     */
    List<CouponBatch> queryCouponBatchList();
}
