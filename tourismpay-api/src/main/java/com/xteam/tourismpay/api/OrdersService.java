package com.xteam.tourismpay.api;

import com.xteam.tourismpay.dto.OrdersDto;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月12日
 * Time: 13:21:25
 * 功能:T_ORDERS表Service接口
 */

public interface OrdersService {

    /**
     * 获取
     *
     * @param ordersDto
     * @return int
     */
    public OrdersDto get(OrdersDto ordersDto) throws Exception;

    /**
     * 新增
     *
     * @param ordersDto
     * @return int
     */
    public int insert(OrdersDto ordersDto) throws Exception;

    /**
     * 批量新增
     *
     * @param list
     * @return int
     */
    public int batchInsert(List<OrdersDto> list) throws Exception;

    /**
     * 删除
     *
     * @param ordersDto
     * @return int
     */
    public int delete(OrdersDto ordersDto) throws Exception;

    /**
     * 更新
     *
     * @param ordersDto
     * @return int
     */
    public int update(OrdersDto ordersDto) throws Exception;

    /**
     * 查询
     *
     * @param ordersDto
     * @return List<OrdersDto>
     */
    public List<OrdersDto> query(OrdersDto ordersDto) throws Exception;

    /**
     * 查询记录数
     *
     * @param ordersDto
     * @return List<OrdersDto>
     */
    public Integer queryCount(OrdersDto ordersDto) throws Exception;
}
