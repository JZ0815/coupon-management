package com.jie.trade.coupon.db.dao;

import com.jie.trade.coupon.db.model.CouponBatch;

import java.util.List;

public interface CouponBatchDao {
    /**
     * 新增一个券批次
     *
     * @param couponBatch
     * @return
     */
    boolean insertCouponBatch(CouponBatch couponBatch);

    /**
     * 根据ID删除对应的券批次
     *
     * @param id
     * @return
     */
    boolean deleteCouponBatchById(long id);

    /**
     * 根据ID查询对应的券批次
     *
     * @param id
     * @return
     */
    CouponBatch queryCouponBatchById(long id);

    /**
     * 修改对应的券批次
     *
     * @param couponBatch
     * @return
     */
    boolean updateCouponBatch(CouponBatch couponBatch);

    /**
     * 查询优惠券批次列表
     * @return
     */
    List<CouponBatch> queryCouponBatchList();
}
