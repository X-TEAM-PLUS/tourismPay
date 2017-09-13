package com.xteam.tourismpay.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.xteam.tourismpay.common.JsonResult;


import java.util.List;

import com.xteam.tourismpay.api.RecordService;
import com.xteam.tourismpay.dto.RecordDto;

/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月13日
 * Time: 14:18:01
 * 功能:门票消费记录表【T_TICKET_RECORD】控制器
 */

@Controller
@RequestMapping("/tourismpay/record")
public class RecordController{
    private static final Log log = LogFactory.getLog(RecordController.class);

   @javax.annotation.Resource
   private RecordService recordService ;

       @RequestMapping("/index")
       public String index(){
           return  "/record/index";
       }

    /**
     * 查询门票消费记录列表页
     * @param recordDto
     * @return
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public JsonResult list(RecordDto recordDto){
        JsonResult jsonResult = new JsonResult();
        try{
            List<RecordDto> data = recordService.query(recordDto);
            // 设置结果集
            jsonResult.put("list", data);
            jsonResult.put("rowCount", recordService.queryCount(recordDto));
            jsonResult.setSuccess(true);
        }catch (Exception e){
            log.error("查询异常",e);
            jsonResult.setMessage("查询异常");
            jsonResult.setSuccess(false);
        }
        return jsonResult;
    }


    @RequestMapping(value = "/add")
    public String add() {
        return "/record/add";
    }

    /**
     * 新增门票消费记录
     * @param recordDto
     * @return
     */
   @RequestMapping(value = "/post")
   @ResponseBody
   public JsonResult  post(RecordDto recordDto) throws Exception{
       JsonResult jsonResult = new JsonResult();
       try{
         //保存
        recordService.insert(recordDto);
        jsonResult.setSuccess(true);
       }catch (Exception e){
            log.error("提交数据异常",e);
            jsonResult.setMessage("提交数据异常");
            jsonResult.setSuccess(false);
        }
       return jsonResult;
   }

    /**
     * 删除门票消费记录
     * @param recordDto
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
   public JsonResult   delete(RecordDto recordDto) throws Exception{
       JsonResult jsonResult = new JsonResult();
       try{
           //删除记录
          recordService.delete(recordDto);
          jsonResult.setSuccess(true);
         } catch (Exception e){
          log.error("删除数据异常",e);
          jsonResult.setMessage("删除数据异常");
          jsonResult.setSuccess(false);
       }
       return jsonResult;
   }


    @RequestMapping("/edit")
    public ModelAndView edit(RecordDto recordDto) {
        ModelAndView modelAndView = new ModelAndView("record/edit");
        try {
            modelAndView.addObject("record", recordService.get(recordDto));
        } catch (Exception e) {
            log.error("获取数据异常", e);
        }
        return modelAndView;
    }


    /**
     * 更新门票消费记录
     * @param recordDto
     * @return
     */
    @RequestMapping(value = "/put")
    @ResponseBody
   public JsonResult   put(RecordDto recordDto) throws Exception{
        JsonResult jsonResult = new JsonResult();
        try{
             //更新记录
            recordService.update(recordDto);
            jsonResult.setSuccess(true);
        }catch (Exception e){
            log.error("更新数据异常",e);
            jsonResult.setMessage("更新数据异常");
            jsonResult.setSuccess(false);
        }
        return jsonResult;
   }

    /**
     * 获取门票消费记录详情
     * @param recordDto
     * @return
     */
    @RequestMapping(value = "/get")
    @ResponseBody
   public JsonResult   get(RecordDto recordDto) throws Exception{
           JsonResult jsonResult = new JsonResult();
           try{
            //获取记录
            jsonResult.setData(recordService.get(recordDto));
            jsonResult.setSuccess(true);
           }catch (Exception e){
            log.error("更新数据异常",e);
            jsonResult.setMessage("更新数据异常");
            jsonResult.setSuccess(false);
           }
           return jsonResult;
   }
}
