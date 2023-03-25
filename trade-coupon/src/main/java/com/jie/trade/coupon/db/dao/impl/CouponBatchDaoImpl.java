package com.jie.trade.coupon.db.dao.impl;

import com.jie.trade.coupon.db.dao.CouponBatchDao;
import com.jie.trade.coupon.db.mappers.CouponBatchMapper;
import com.jie.trade.coupon.db.model.CouponBatch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 券批次-数据库操作
 */
@Slf4j
@Service
public class CouponBatchDaoImpl implements CouponBatchDao {

    @Autowired
    private CouponBatchMapper couponBatchMapper;

    @Override
    public boolean insertCouponBatch(CouponBatch couponBatch) {
        int result = couponBatchMapper.insert(couponBatch);
        //大于0 表示插入成功
        return result > 0;
    }

    @Override
    public boolean deleteCouponBatchById(long id) {
        int result = couponBatchMapper.deleteByPrimaryKey(id);
        return result > 0;
    }

    @Override
    public CouponBatch queryCouponBatchById(long id) {
        return couponBatchMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateCouponBatch(CouponBatch couponBatch) {
        int result = couponBatchMapper.updateByPrimaryKey(couponBatch);
        return result > 0;
    }

    @Override
    public List<CouponBatch> queryCouponBatchList() {
        return couponBatchMapper.queryCouponBatchList();
    }
}
