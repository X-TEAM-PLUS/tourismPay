package com.xteam.tourismpay.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.xteam.tourismpay.api.RecordService;
import com.xteam.tourismpay.domain.Record;
import com.xteam.tourismpay.dto.RecordDto;
import com.xteam.tourismpay.manager.RecordManager;

import com.xteam.tourismpay.common.JsonUtils;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月13日
 * Time: 14:18:00
 *  功能:T_TICKET_RECORD表Service接口实现类
 */

@Service
public class RecordServiceImpl  implements  RecordService  {
    private static final Log log = LogFactory.getLog(RecordServiceImpl.class);
   @javax.annotation.Resource
   private RecordManager recordManager ;


 @Override
  public RecordDto get(RecordDto recordDto) throws Exception{
        Record record = JsonUtils.transform(recordDto,Record.class);
        return  JsonUtils.transform( recordManager.get(record),RecordDto.class);
  }

  @Override
   public int insert(RecordDto recordDto) throws Exception{
     Record record = JsonUtils.transform(recordDto,Record.class);
     return  recordManager.insert(record);
   }

    @Override
   public int batchInsert(List<RecordDto>  list) throws Exception{
        List<Record> rows =  JsonUtils.transform(list,Record.class);
        return  recordManager.batchInsert(rows);
   }

    @Override
   public int delete(RecordDto recordDto) throws Exception{
        Record record = JsonUtils.transform(recordDto,Record.class);
      return recordManager.delete(record);
   }

    @Override
   public int update(RecordDto recordDto) throws Exception{
    Record record = JsonUtils.transform(recordDto,Record.class);
      return recordManager.update(record);
   }

    @Override
   public List<RecordDto> query(RecordDto recordDto) throws Exception{
             Record record = JsonUtils.transform(recordDto,Record.class);
             List<Record> list = recordManager.query(record);
             return JsonUtils.transform(list,RecordDto.class);
   }

   @Override
   public Integer queryCount(RecordDto recordDto) throws Exception{
        Record record = JsonUtils.transform(recordDto,Record.class);
        return recordManager.queryCount(record);
   }
}
