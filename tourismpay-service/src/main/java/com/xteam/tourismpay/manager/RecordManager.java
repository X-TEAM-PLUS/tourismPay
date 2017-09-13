package com.xteam.tourismpay.manager;

import java.util.List;
import com.xteam.tourismpay.domain.Record;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月13日
 * Time: 14:18:00
 *  功能:T_TICKET_RECORD表Manager接口
 */

public interface RecordManager  {

    /**
     * 获取
     * @param record
     * @return int
     */
 public  Record get(Record record) throws Exception;

    /**
     * 新增
     * @param record
     * @return int
     */
   public int insert(Record record) throws Exception;

   /**
    * 批量新增
    * @param list
    * @return int
   */
   public int batchInsert(List<Record> list) throws Exception;

    /**
      * 删除
      * @param record
      * @return int
      */
   public int delete(Record record) throws Exception;

    /**
     * 更新
     * @param record
     * @return int
     */
   public int update(Record record) throws Exception;

     /**
      * 查询
      * @param record
      * @return List<Record>
      */
   public List<Record> query(Record record) throws Exception;

    /**
     * 查询记录数
     * @param record
     * @return List<Record>
    */
    public Integer queryCount(Record record) throws Exception;
}
