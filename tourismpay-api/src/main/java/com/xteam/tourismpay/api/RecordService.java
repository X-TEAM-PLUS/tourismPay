package com.xteam.tourismpay.api;

import com.xteam.tourismpay.dto.RecordDto;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月13日
 * Time: 14:18:01
 * 功能:T_TICKET_RECORD表Service接口
 */

public interface RecordService {

    /**
     * 获取
     *
     * @param recordDto
     * @return int
     */
    public RecordDto get(RecordDto recordDto) throws Exception;

    /**
     * 新增
     *
     * @param recordDto
     * @return int
     */
    public int insert(RecordDto recordDto) throws Exception;

    /**
     * 批量新增
     *
     * @param list
     * @return int
     */
    public int batchInsert(List<RecordDto> list) throws Exception;

    /**
     * 删除
     *
     * @param recordDto
     * @return int
     */
    public int delete(RecordDto recordDto) throws Exception;

    /**
     * 更新
     *
     * @param recordDto
     * @return int
     */
    public int update(RecordDto recordDto) throws Exception;

    /**
     * 查询
     *
     * @param recordDto
     * @return List<RecordDto>
     */
    public List<RecordDto> query(RecordDto recordDto) throws Exception;

    /**
     * 查询记录数
     *
     * @param recordDto
     * @return List<RecordDto>
     */
    public Integer queryCount(RecordDto recordDto) throws Exception;
}
