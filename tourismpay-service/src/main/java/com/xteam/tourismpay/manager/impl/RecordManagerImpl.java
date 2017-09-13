package com.xteam.tourismpay.manager.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.xteam.tourismpay.manager.RecordManager;
import com.xteam.tourismpay.domain.Record;
import com.xteam.tourismpay.dao.RecordDao;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月13日
 * Time: 14:18:00
 *  功能:T_TICKET_RECORD表Manager接口实现类
 */

@Service
public class RecordManagerImpl  implements  RecordManager  {
 private static final Log log = LogFactory.getLog(RecordManagerImpl.class);
   @javax.annotation.Resource
   private RecordDao recordDao ;


 @Override
  public Record get(Record record) throws Exception{
        return  recordDao.get(record);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
   public int insert(Record record) throws Exception{
     return  recordDao.insert(record);
   }

    @Override
     @Transactional(rollbackFor = Exception.class)
   public int batchInsert(List<Record>  list) throws Exception{
     return  recordDao.batchInsert(list);
   }

    @Override
     @Transactional(rollbackFor = Exception.class)
   public int delete(Record record) throws Exception{
      return recordDao.delete(record);
   }

    @Override
     @Transactional(rollbackFor = Exception.class)
   public int update(Record record) throws Exception{
      return recordDao.update(record);
   }

    @Override
   public List<Record> query(Record record) throws Exception{
         return recordDao.query(record);
   }

   @Override
   public Integer queryCount(Record record) throws Exception{
        return recordDao.queryCount(record);
   }

}
