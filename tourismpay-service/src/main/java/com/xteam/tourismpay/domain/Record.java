package com.xteam.tourismpay.domain;

import java.io.Serializable;
import java.util.Date;

import java.math.BigDecimal;


/**
 * Created by IntelliJ IDEA.
 * User: yankun
 * Date: 2017年09月13日
 * Time: 14:24:16
 * TableName:T_TICKET_RECORD
 */

public class Record implements Serializable {

  private  Integer start;

  private Integer limit = 20;
     

/**
*  action_time
*/
private String actionTime;
/**
*  updated
*/
private Date updated;
/**
*  created
*/
private Date created;
/**
*  order_state
*/
private String orderState;
/**
*  tnumber
*/
private String tnumber;
/**
*  source
*/
private String source;
/**
*  all_check_num
*/
private String allCheckNum;
/**
*  refund_type
*/
private String refundType;
/**
*  action
*/
private String action;
/**
*  id
*/
private BigDecimal id;
/**
*  refund_amount
*/
private BigDecimal refundAmount;
/**
*  remark
*/
private String remark;
/**
*  pft_order_no
*/
private String pftOrderNo;
/**
*  order_no
*/
private BigDecimal orderNo;
/**
*  refund_fee
*/
private BigDecimal refundFee;

/**
*   设置 actionTime
* @param actionTime action_time
*/
public void  setActionTime(String actionTime){
      this.actionTime = actionTime;
}

/**
*   获取 actionTime
* return  
*/
public String  getActionTime(){
      return this.actionTime;
}

/**
*   设置 updated
* @param updated updated
*/
public void  setUpdated(Date updated){
      this.updated = updated;
}

/**
*   获取 updated
* return  
*/
public Date  getUpdated(){
      return this.updated;
}

/**
*   设置 created
* @param created created
*/
public void  setCreated(Date created){
      this.created = created;
}

/**
*   获取 created
* return  
*/
public Date  getCreated(){
      return this.created;
}

/**
*   设置 orderState
* @param orderState order_state
*/
public void  setOrderState(String orderState){
      this.orderState = orderState;
}

/**
*   获取 orderState
* return  
*/
public String  getOrderState(){
      return this.orderState;
}

/**
*   设置 tnumber
* @param tnumber tnumber
*/
public void  setTnumber(String tnumber){
      this.tnumber = tnumber;
}

/**
*   获取 tnumber
* return  
*/
public String  getTnumber(){
      return this.tnumber;
}

/**
*   设置 source
* @param source source
*/
public void  setSource(String source){
      this.source = source;
}

/**
*   获取 source
* return  
*/
public String  getSource(){
      return this.source;
}

/**
*   设置 allCheckNum
* @param allCheckNum all_check_num
*/
public void  setAllCheckNum(String allCheckNum){
      this.allCheckNum = allCheckNum;
}

/**
*   获取 allCheckNum
* return  
*/
public String  getAllCheckNum(){
      return this.allCheckNum;
}

/**
*   设置 refundType
* @param refundType refund_type
*/
public void  setRefundType(String refundType){
      this.refundType = refundType;
}

/**
*   获取 refundType
* return  
*/
public String  getRefundType(){
      return this.refundType;
}

/**
*   设置 action
* @param action action
*/
public void  setAction(String action){
      this.action = action;
}

/**
*   获取 action
* return  
*/
public String  getAction(){
      return this.action;
}

/**
*   设置 id
* @param id id
*/
public void  setId(BigDecimal id){
      this.id = id;
}

/**
*   获取 id
* return  
*/
public BigDecimal  getId(){
      return this.id;
}

/**
*   设置 refundAmount
* @param refundAmount refund_amount
*/
public void  setRefundAmount(BigDecimal refundAmount){
      this.refundAmount = refundAmount;
}

/**
*   获取 refundAmount
* return  
*/
public BigDecimal  getRefundAmount(){
      return this.refundAmount;
}

/**
*   设置 remark
* @param remark remark
*/
public void  setRemark(String remark){
      this.remark = remark;
}

/**
*   获取 remark
* return  
*/
public String  getRemark(){
      return this.remark;
}

/**
*   设置 pftOrderNo
* @param pftOrderNo pft_order_no
*/
public void  setPftOrderNo(String pftOrderNo){
      this.pftOrderNo = pftOrderNo;
}

/**
*   获取 pftOrderNo
* return  
*/
public String  getPftOrderNo(){
      return this.pftOrderNo;
}

/**
*   设置 orderNo
* @param orderNo order_no
*/
public void  setOrderNo(BigDecimal orderNo){
      this.orderNo = orderNo;
}

/**
*   获取 orderNo
* return  
*/
public BigDecimal  getOrderNo(){
      return this.orderNo;
}

/**
*   设置 refundFee
* @param refundFee refund_fee
*/
public void  setRefundFee(BigDecimal refundFee){
      this.refundFee = refundFee;
}

/**
*   获取 refundFee
* return  
*/
public BigDecimal  getRefundFee(){
      return this.refundFee;
}

      public Integer getStart() {
                 return start;
           }

           public void setStart(Integer start) {
                 this.start = start;
           }

           public Integer getLimit() {
                 return limit;
           }

           public void setLimit(Integer limit) {
                 this.limit = limit;
           }
}
