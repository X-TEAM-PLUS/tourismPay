package com.xteam.tourismpay.manager.impl;

import com.xteam.tourismpay.dao.OrdersDao;
import com.xteam.tourismpay.domain.Orders;
import com.xteam.tourismpay.manager.OrdersManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月10日
 * Time: 09:47:05
 * 功能:T_ORDERS表Manager接口实现类
 */

@Service
public class OrdersManagerImpl implements OrdersManager {
    private static final Log log = LogFactory.getLog(OrdersManagerImpl.class);
    @javax.annotation.Resource
    private OrdersDao ordersDao;


    @Override
    public Orders get(Orders orders) throws Exception {
        return ordersDao.get(orders);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(Orders orders) throws Exception {
        return ordersDao.insert(orders);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int batchInsert(List<Orders> list) throws Exception {
        return ordersDao.batchInsert(list);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Orders orders) throws Exception {
        return ordersDao.delete(orders);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(Orders orders) throws Exception {
        return ordersDao.update(orders);
    }

    @Override
    public List<Orders> query(Orders orders) throws Exception {
        return ordersDao.query(orders);
    }

    @Override
    public Integer queryCount(Orders orders) throws Exception {
        return ordersDao.queryCount(orders);
    }

}
