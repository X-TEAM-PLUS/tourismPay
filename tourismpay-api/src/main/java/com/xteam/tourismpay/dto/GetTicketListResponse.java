package com.xteam.tourismpay.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rec", propOrder = {
        "uuErrorcode",
        "uuErrorinfo",
        "uuLid",
        "uuid",
        "uuTitle",
        "uuPid",
        "uuGetAddr",
        "uuDelayDays",
        "uuStatus",
        "uuReb",
        "uuRebType",
        "uuDHour",
        "uuStartPlace",
        "uuEndPlace",
        "uuTouristInfo",
        "uuAssStation",
        "uuSeriesModel",
        "uuAid",
        "uuTprice",
        "uuPay",
        "uuBuyLimitUp",
        "uuBuyLimitLow",
        "uuRefundAudit",
        "uuNotes",
        "uuDdays",
        "UUBuyLimit",
        "uuBuyLimitDate",
        "uuBuyLimitNum",
        "uuOrderStart",
        "uuOrderEnd",
        "uuDelayType",
        "uuDelayTime",
        "uuOrderLimit",
        "uuRefundRule",
        "uuRefundEarlyTime",
        "uuVTimeLimit",
        "uuCancelCost",
        "uuBatchCheck"
})
public class GetTicketListResponse {
    /**
     * 错误 代码
     */
    @XmlElement(name = "UUerrorcode")
    private String uuErrorcode;

    /**
     * 错误信息
     */
    @XmlElement(name = "UUerrorinfo")
    private String uuErrorinfo;

    /**
     * 景区id
     */
    @XmlElement(name = "UUlid")
    private Integer uuLid	;

//    /**
//     * 景区名称
//     */
//    @XmlElement(name = "UUtitle")
//    private String uuTitle;

    /**
     * 门票id
     */
    @XmlElement(name = "UUid")
    private Integer uuid;

    /**
     * 门票名称
     */
    @XmlElement(name = "UUtitle")
    private String uuTitle	;

    /**
     * 产品id
     */
    @XmlElement(name = "UUpid")
    private String uuPid	;

    /**
     * 取票信息
     */
    @XmlElement(name = "UUgetaddr")
    private String uuGetAddr;

    /**
     * 允许推迟游玩的天数
     */
    @XmlElement(name = "UUdelaydays")
    private String  uuDelayDays;

    /**
     * 票在售状态 0 在售
     */
    @XmlElement(name = "UUstatus")
    private Integer uuStatus;

    /**
     * 退款手续费
     */
    @XmlElement(name = "UUreb")
    private String  uuReb;

    /**
     * 退款类型 取消费用类型 0 百分 比，1 实际指定具体值
     */
    @XmlElement(name = "UUreb_type")
    private Integer uuRebType;

    /**
     * 提前下单截止日具体时 (时:分:秒)12:12:12
     */
    @XmlElement(name = "UUdhour")
    private String uuDHour		;

    /**
     * 出发城市或地区	(线路)
     */
    @XmlElement(name = "UUstartplace")
    private String uuStartPlace;

    /**
     * 目的地(线路)
     */
    @XmlElement(name = "UUendplace")
    private String uuEndPlace;

    /**
     * 身份证信息 0 不需要填写，1 只需填写一位游客信息，2需要填写每位游客信息集
     */
    @XmlElement(name = "UUtourist_info")
    private Integer uuTouristInfo			;

    /**
     * 合地点
     */
    @XmlElement(name = "UUass_station")
    private String uuAssStation;

    /**
     * 团号模型 	 		类推（线路）XXX{年月日131212}XX（线路）
     */
    @XmlElement(name = "UUseries_model")
    private String uuSeriesModel	;

    /**
     * 供应商id
     */
    @XmlElement(name = "UUaid")
    private Integer uuAid;

    /**
     * 门市价 单位:元
     */
    @XmlElement(name = "UUtprice")
    private Float uuTprice	;

    /**
     * 支付方式  0现场支付 1在线支付
     */
    @XmlElement(name = "UUpay")
    private Integer  uuPay;

    /**
     *一次最多购买的票数
     */
    @XmlElement(name = "UUbuy_limit_up")
    private Integer uuBuyLimitUp;

    /**
     * 一次最少购买的票数
     */
    @XmlElement(name = "UUbuy_limit_low")
    private Integer uuBuyLimitLow;

    /**
     * 是否要退款审核  		 		0 无需，1 需要
     */
    @XmlElement(name = "UUrefund_audit")
    private Integer uuRefundAudit;

    /**
     * 产品说明
     */
    @XmlElement(name = "UUnotes")
    private String uuNotes;

    /**
     * 提前预定天数
     */
    @XmlElement(name = "UUddays")
    private Integer uuDdays;

    /**
     * 限购类型
     * 0 不限，
     * 1 手机号限购每笔，
     * 2 身份证限购每笔，
     * 3 手机号限购每张，
     * 4 身份整限购每张，
     * 5手机号+身份证每张，
     * 6 手机号+身份证每笔
     */
    @XmlElement(name = "intUUbuy_limit")
    private Integer UUBuyLimit;

    /**
     * 限购方式 0 整个销售时间段，1 每日，2 每周，3 每月
     */
    @XmlElement(name = "UUbuy_limit_date")
    private Integer uuBuyLimitDate;

    /**
     * 限购张数
     */
    @XmlElement(name = "UUbuy_limit_num")
    private Integer uuBuyLimitNum;

    /**
     * 期票开始时间
     */
    @XmlElement(name = "UUorder_start")
    private Date uuOrderStart;

    /**
     * 期票结束时间
     */
    @XmlElement(name = "UUorder_end")
    private Date uuOrderEnd;

    /**
     * 使用有效期类型				0 游玩日期起有效，1下单日期起有效，2 期票模式
     */
    @XmlElement(name = "UUdelaytype")
    private Integer uuDelayType	;

    /**
     * 延迟验证 为空或者为0
     */
    @XmlElement(name = "UUdelaytime")
    private String   uuDelayTime;

    /**
     * 不可使用星期 例子：1,7 代表周日周六不可验证
     */
    @XmlElement(name = "UUorder_limit")
    private String uuOrderLimit;


    /**
     * 退票规则 0 游玩日期内可退，1游玩日期前可退需在验证截止时间前退，2 不可退
     */
    @XmlElement(name = "UUrefund_rule")
    private Integer uuRefundRule;

    /**
     * 最早退票时间 按分钟算
     */
    @XmlElement(name = "UUrefund_early_time")
    private Integer uuRefundEarlyTime;

    /**
     * 可验证时间段 例子：18:00
     */
    @XmlElement(name = "UUv_time_limit")
    private String uuVTimeLimit;

    /**
     * 阶梯退票
     * json		'c_type'=>类型0 固定金额1 百分比,'c_days'=>游玩前分钟数,'c_cost'=>扣款金额，例子：{"c_days":"1440","c_type":"0","c_cost":"200"},{"c_days":"2880","c_type":"0","c_cost":"300"}
     游玩日期验证截至时间1440 前分钟退票固定金
     额扣2 块钱，……
     */
    @XmlElement(name = "UUcancel_cost")
    private String uuCancelCost;

    /**
     * 是否支持分批验证 0 不支持1 支持
     */
    @XmlElement(name = "UUbatch_check")
    private  Integer uuBatchCheck;


    public String getUuErrorcode() {
        return uuErrorcode;
    }

    public void setUuErrorcode(String uuErrorcode) {
        this.uuErrorcode = uuErrorcode;
    }

    public String getUuErrorinfo() {
        return uuErrorinfo;
    }

    public void setUuErrorinfo(String uuErrorinfo) {
        this.uuErrorinfo = uuErrorinfo;
    }

    public Integer getUuLid() {
        return uuLid;
    }

    public void setUuLid(Integer uuLid) {
        this.uuLid = uuLid;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getUuTitle() {
        return uuTitle;
    }

    public void setUuTitle(String uuTitle) {
        this.uuTitle = uuTitle;
    }

    public String getUuPid() {
        return uuPid;
    }

    public void setUuPid(String uuPid) {
        this.uuPid = uuPid;
    }

    public String getUuGetAddr() {
        return uuGetAddr;
    }

    public void setUuGetAddr(String uuGetAddr) {
        this.uuGetAddr = uuGetAddr;
    }

    public String getUuDelayDays() {
        return uuDelayDays;
    }

    public void setUuDelayDays(String uuDelayDays) {
        this.uuDelayDays = uuDelayDays;
    }

    public Integer getUuStatus() {
        return uuStatus;
    }

    public void setUuStatus(Integer uuStatus) {
        this.uuStatus = uuStatus;
    }

    public String getUuReb() {
        return uuReb;
    }

    public void setUuReb(String uuReb) {
        this.uuReb = uuReb;
    }

    public Integer getUuRebType() {
        return uuRebType;
    }

    public void setUuRebType(Integer uuRebType) {
        this.uuRebType = uuRebType;
    }

    public String getUuDHour() {
        return uuDHour;
    }

    public void setUuDHour(String uuDHour) {
        this.uuDHour = uuDHour;
    }

    public String getUuStartPlace() {
        return uuStartPlace;
    }

    public void setUuStartPlace(String uuStartPlace) {
        this.uuStartPlace = uuStartPlace;
    }

    public String getUuEndPlace() {
        return uuEndPlace;
    }

    public void setUuEndPlace(String uuEndPlace) {
        this.uuEndPlace = uuEndPlace;
    }

    public Integer getUuTouristInfo() {
        return uuTouristInfo;
    }

    public void setUuTouristInfo(Integer uuTouristInfo) {
        this.uuTouristInfo = uuTouristInfo;
    }

    public String getUuAssStation() {
        return uuAssStation;
    }

    public void setUuAssStation(String uuAssStation) {
        this.uuAssStation = uuAssStation;
    }

    public String getUuSeriesModel() {
        return uuSeriesModel;
    }

    public void setUuSeriesModel(String uuSeriesModel) {
        this.uuSeriesModel = uuSeriesModel;
    }

    public Integer getUuAid() {
        return uuAid;
    }

    public void setUuAid(Integer uuAid) {
        this.uuAid = uuAid;
    }

    public Float getUuTprice() {
        return uuTprice;
    }

    public void setUuTprice(Float uuTprice) {
        this.uuTprice = uuTprice;
    }

    public Integer getUuPay() {
        return uuPay;
    }

    public void setUuPay(Integer uuPay) {
        this.uuPay = uuPay;
    }

    public Integer getUuBuyLimitUp() {
        return uuBuyLimitUp;
    }

    public void setUuBuyLimitUp(Integer uuBuyLimitUp) {
        this.uuBuyLimitUp = uuBuyLimitUp;
    }

    public Integer getUuBuyLimitLow() {
        return uuBuyLimitLow;
    }

    public void setUuBuyLimitLow(Integer uuBuyLimitLow) {
        this.uuBuyLimitLow = uuBuyLimitLow;
    }

    public Integer getUuRefundAudit() {
        return uuRefundAudit;
    }

    public void setUuRefundAudit(Integer uuRefundAudit) {
        this.uuRefundAudit = uuRefundAudit;
    }

    public String getUuNotes() {
        return uuNotes;
    }

    public void setUuNotes(String uuNotes) {
        this.uuNotes = uuNotes;
    }

    public Integer getUuDdays() {
        return uuDdays;
    }

    public void setUuDdays(Integer uuDdays) {
        this.uuDdays = uuDdays;
    }

    public Integer getUUBuyLimit() {
        return UUBuyLimit;
    }

    public void setUUBuyLimit(Integer UUBuyLimit) {
        this.UUBuyLimit = UUBuyLimit;
    }

    public Integer getUuBuyLimitDate() {
        return uuBuyLimitDate;
    }

    public void setUuBuyLimitDate(Integer uuBuyLimitDate) {
        this.uuBuyLimitDate = uuBuyLimitDate;
    }

    public Integer getUuBuyLimitNum() {
        return uuBuyLimitNum;
    }

    public void setUuBuyLimitNum(Integer uuBuyLimitNum) {
        this.uuBuyLimitNum = uuBuyLimitNum;
    }

    public Date getUuOrderStart() {
        return uuOrderStart;
    }

    public void setUuOrderStart(Date uuOrderStart) {
        this.uuOrderStart = uuOrderStart;
    }

    public Date getUuOrderEnd() {
        return uuOrderEnd;
    }

    public void setUuOrderEnd(Date uuOrderEnd) {
        this.uuOrderEnd = uuOrderEnd;
    }

    public Integer getUuDelayType() {
        return uuDelayType;
    }

    public void setUuDelayType(Integer uuDelayType) {
        this.uuDelayType = uuDelayType;
    }

    public String getUuDelayTime() {
        return uuDelayTime;
    }

    public void setUuDelayTime(String uuDelayTime) {
        this.uuDelayTime = uuDelayTime;
    }

    public String getUuOrderLimit() {
        return uuOrderLimit;
    }

    public void setUuOrderLimit(String uuOrderLimit) {
        this.uuOrderLimit = uuOrderLimit;
    }

    public Integer getUuRefundRule() {
        return uuRefundRule;
    }

    public void setUuRefundRule(Integer uuRefundRule) {
        this.uuRefundRule = uuRefundRule;
    }

    public Integer getUuRefundEarlyTime() {
        return uuRefundEarlyTime;
    }

    public void setUuRefundEarlyTime(Integer uuRefundEarlyTime) {
        this.uuRefundEarlyTime = uuRefundEarlyTime;
    }

    public String getUuVTimeLimit() {
        return uuVTimeLimit;
    }

    public void setUuVTimeLimit(String uuVTimeLimit) {
        this.uuVTimeLimit = uuVTimeLimit;
    }

    public String getUuCancelCost() {
        return uuCancelCost;
    }

    public void setUuCancelCost(String uuCancelCost) {
        this.uuCancelCost = uuCancelCost;
    }

    public Integer getUuBatchCheck() {
        return uuBatchCheck;
    }

    public void setUuBatchCheck(Integer uuBatchCheck) {
        this.uuBatchCheck = uuBatchCheck;
    }
}
