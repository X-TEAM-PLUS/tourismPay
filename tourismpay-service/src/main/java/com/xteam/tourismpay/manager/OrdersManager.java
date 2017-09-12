package com.xteam.tourismpay.manager;

import com.xteam.tourismpay.domain.Orders;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月12日
 * Time: 13:21:24
 * 功能:T_ORDERS表Manager接口
 */

public interface OrdersManager {

    /**
     * 获取
     *
     * @param orders
     * @return int
     */
    public Orders get(Orders orders) throws Exception;

    /**
     * 新增
     *
     * @param orders
     * @return int
     */
    public int insert(Orders orders) throws Exception;

    /**
     * 批量新增
     *
     * @param list
     * @return int
     */
    public int batchInsert(List<Orders> list) throws Exception;

    /**
     * 删除
     *
     * @param orders
     * @return int
     */
    public int delete(Orders orders) throws Exception;

    /**
     * 更新
     *
     * @param orders
     * @return int
     */
    public int update(Orders orders) throws Exception;

    /**
     * 查询
     *
     * @param orders
     * @return List<Orders>
     */
    public List<Orders> query(Orders orders) throws Exception;

    /**
     * 查询记录数
     *
     * @param orders
     * @return List<Orders>
     */
    public Integer queryCount(Orders orders) throws Exception;
}
