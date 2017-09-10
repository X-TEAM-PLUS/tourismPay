package com.xteam.tourismpay.dao;

import com.xteam.tourismpay.domain.Orders;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月10日
 * Time: 09:47:04
 * 功能:T_ORDERS表Mapper接口
 */

public interface OrdersDao {

    /**
     * 获取
     *
     * @param orders
     * @return Orders
     */
    public Orders get(Orders orders);

    /**
     * 新增
     *
     * @param orders
     * @return int
     */
    public int insert(Orders orders);

    /**
     * 新增
     *
     * @param list
     * @return int
     */
    public int batchInsert(List<Orders> list);

    /**
     * 删除
     *
     * @param orders
     * @return int
     */
    public int delete(Orders orders);

    /**
     * 更新
     *
     * @param orders
     * @return int
     */
    public int update(Orders orders);

    /**
     * 查询记录
     *
     * @param orders
     * @return List<Orders>
     */
    public List<Orders> query(Orders orders);

    /**
     * 查询记录数
     *
     * @param orders
     * @return List<Orders>
     */
    public Integer queryCount(Orders orders);
}
