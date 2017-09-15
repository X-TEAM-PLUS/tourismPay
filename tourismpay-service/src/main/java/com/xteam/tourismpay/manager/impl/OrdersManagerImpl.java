package com.xteam.tourismpay.manager.impl;

import com.xteam.tourismpay.dao.OrdersDao;
import com.xteam.tourismpay.dao.RecordDao;
import com.xteam.tourismpay.domain.Orders;
import com.xteam.tourismpay.domain.Record;
import com.xteam.tourismpay.dto.TicketNotify;
import com.xteam.tourismpay.manager.OrdersManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月12日
 * Time: 13:21:25
 * 功能:T_ORDERS表Manager接口实现类
 */

@Service
public class OrdersManagerImpl implements OrdersManager {
    private static final Log log = LogFactory.getLog(OrdersManagerImpl.class);
    @javax.annotation.Resource
    private OrdersDao ordersDao;
    @javax.annotation.Resource
    private RecordDao recordDao;

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

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(TicketNotify ticketNotify) throws Exception {
        Orders queryBean = new Orders();
        queryBean.setOrderNo(BigDecimal.valueOf(Long.valueOf(ticketNotify.getOrderCall())));
        Orders orders =ordersDao.get(queryBean);

        if(orders==null){
            throw  new Exception("原订单不存在： 订单号【"+ticketNotify.getOrderCall() +"");
        }
        //更新出票成功
        orders.setOrderStatus(3);
        orders.setUpdated(new Date());
        ordersDao.update(orders);
        //插入出票记录
        Record record =  new Record();
        record.setOrderNo(BigDecimal.valueOf(Long.valueOf(ticketNotify.getOrderCall())));
        record.setPftOrderNo(ticketNotify.getOrder16U());
        record.setActionTime(ticketNotify.getActionTime());
        record.setTnumber(ticketNotify.getTnumber());
        record.setOrderState(ticketNotify.getOrderState());
        record.setAllCheckNum(ticketNotify.getAllCheckNum());
        record.setSource(ticketNotify.getSource());
        record.setRefundType(ticketNotify.getRefundtype());
        record.setRemark(ticketNotify.getExplain());
        record.setRefundAmount(ticketNotify.getRefundAmount()!=null?BigDecimal.valueOf(Long.valueOf(ticketNotify.getRefundAmount())):BigDecimal.ZERO);
        record.setRefundFee(ticketNotify.getRefundFee()!=null?BigDecimal.valueOf(Long.valueOf(ticketNotify.getRefundFee())):BigDecimal.ZERO);
        record.setCreated(new Date());
        record.setUpdated(new Date());
        return recordDao.insert(record);

    }

}
