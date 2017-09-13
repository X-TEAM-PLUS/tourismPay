package com.xteam.tourismpay.dao;

import java.util.List;
import com.xteam.tourismpay.domain.Record;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月13日
 * Time: 14:18:00
 *  功能:T_TICKET_RECORD表Mapper接口
 */

public interface RecordDao  {

    /**
     * 获取
     * @param record
     * @return Record
     */
   public Record get(Record record);

    /**
     * 新增
     * @param record
     * @return int
     */
   public int insert(Record record);

     /**
        * 新增
        * @param list
        * @return int
        */
      public int batchInsert(List<Record> list);

    /**
      * 删除
      * @param record
      * @return int
      */
   public int delete(Record record);

    /**
     * 更新
     * @param record
     * @return int
     */
   public int update(Record record);

     /**
      * 查询记录
      * @param record
      * @return List<Record>
      */
   public List<Record> query(Record record);

    /**
         * 查询记录数
         * @param record
         * @return List<Record>
         */
      public Integer queryCount(Record record);
}
