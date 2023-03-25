package com.jie.trade.coupon.service.impl;

import com.jie.trade.coupon.db.dao.CouponBatchDao;
import com.jie.trade.coupon.db.model.CouponBatch;
import com.jie.trade.coupon.service.CouponBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponBatchServiceImpl implements CouponBatchService {

    @Autowired
    private CouponBatchDao couponBatchDao;

    @Override
    public boolean insertCouponBatch(CouponBatch couponBatch) {
        return couponBatchDao.insertCouponBatch(couponBatch);
    }

    @Override
    public List<CouponBatch> queryCouponBatchList() {
        return couponBatchDao.queryCouponBatchList();
    }
}
