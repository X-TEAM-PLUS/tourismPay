package com.xteam.tourismpay.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rec", propOrder = {
        "uuErrorcode",
        "uuErrorinfo",
        "UUmember",
        "UUordernum",
        "UUremotenum",
        "UUlid",
        "UUtid",
        "UUpid",
        "UUbegintime",
        "UUordertime",
        "UUendtime",
        "UUtnum",
        "UUtprice",
        "UUordername",
        "UUordertel",
        "UUstatus",
        "UUsalerid",
        "UUdtime",
        "UUtotalmoney",
        "UUpmode",
        "UUordermode",
        "UUctime",
        "UUcode",
        "UUcontacttel",
        "UUaid",
        "UUifpack",
        "UUpack_order",
        "UUsmserror",
        "UUrefund_num",
        "UUverified_num",
        "UUorigin_num",
        "UUlprice",
        "UUplaytime",
        "UUpay_status",
        "UUconcat_id",
        "UUseries",
        "UUmemo",
        "UUltitle",
        "UUp_type",
        "UUttitle",
        "UUMprice",
        "UUdname",
        "UUtnum_cancel",
        "UUtnum_used",
        "UUifprint"
})
public class OrderQueryResonse {
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
     * 会员id
     */
    @XmlElement(name = "UUmember")
    private String UUmember;
    /**
     * 票付通订单号
     */
    @XmlElement(name = "UUordernum")
    private String UUordernum;
    /**
     * 远端订单号
     */
    @XmlElement(name = "UUremotenum")
    private String UUremotenum;
    /**
     * 景区id
     */
    @XmlElement(name = "UUlid")
    private String UUlid;
    /**
     * 门票id
     */
    @XmlElement(name = "UUtid")
    private String UUtid;
    /**
     * 产品id
     */
    @XmlElement(name = "UUpid")
    private String UUpid;
    /**
     * 订单有效开始时间
     */
    @XmlElement(name = "UUbegintime")
    private String UUbegintime;
    /**
     * 下单时间
     */
    @XmlElement(name = "UUordertime")
    private String UUordertime;
    /**
     * 订单有效结束
     */
    @XmlElement(name = "UUendtime")
    private String UUendtime;
    /**
     * 订单数量
     */
    @XmlElement(name = "UUtnum")
    private String UUtnum;

    /**
     * 订单单价，结算价
     */
    @XmlElement(name = "UUtprice")
    private String UUtprice;
    /**
     * 取票人姓名
     */
    @XmlElement(name = "UUordername")
    private String UUordername;
    /**
     * 取票人手机号
     */
    @XmlElement(name = "UUordertel")
    private String UUordertel;

    /**
     * 订单状态 0未使用|1已使用|2已过期|3被取消|4凭
     * 证码被替代|5 被终端修改|6被终端撤
     * 销|7部分使用
     */
    @XmlElement(name = "UUstatus")
    private String UUstatus;

    /**
     * 景区 salerid
     */
    @XmlElement(name = "UUsalerid")
    private String UUsalerid;

    /**
     * 订单验证时间
     */
    @XmlElement(name = "UUdtime")
    private String UUdtime;

    /**
     * 订单总金额
     */
    @XmlElement(name = "UUtotalmoney")
    private String UUtotalmoney;
    /**
     * 支付方式  1支付宝|2使用分销余额|3信用支付|4到付
     */
    @XmlElement(name = "UUpmode")
    private String UUpmode;

    /**
     * 下单方式 0分销商1 散客
     */
    @XmlElement(name = "UUordermode")
    private String UUordermode;

    /**
     * 订单取消 时间
     */
    @XmlElement(name = "UUctime")
    private String UUctime;

    /**
     * 凭证码
     */
    @XmlElement(name = "UUcode")
    private String UUcode;

    /**
     * 联系人手机号
     */
    @XmlElement(name = "UUcontacttel")
    private String UUcontacttel;
    /**
     * 供应商id
     */
    @XmlElement(name = "UUaid")
    private String UUaid;
    /**
     * 是否套票
     */
    @XmlElement(name = "UUifpack")
    private String UUifpack;

    /**
     * 套票订单号
     */
    @XmlElement(name = "UUpack_order")
    private String UUpack_order;

    /**
     * 短信是否   发送成功 0 成功1 失败
     */
    @XmlElement(name = "UUsmserror")
    private String UUsmserror;
    /**
     * 退款手续费
     */
    @XmlElement(name = "UUrefund_num")
    private String UUrefund_num;

    @XmlElement(name = "UUverified_num")
    private String UUverified_num;

    @XmlElement(name = "UUorigin_num")
    private String UUorigin_num;
    /**
     * 零售单价
     */
    @XmlElement(name = "UUlprice")
    private String UUlprice;
    /**
     * 游玩日期
     */
    @XmlElement(name = "UUplaytime")
    private String UUplaytime;
    /**
     * 支付状态 0景区到付|1已成功|2未支付
     */
    @XmlElement(name = "UUpay_status")
    private String UUpay_status;

    /**
     * 联票关联订单
     */
    @XmlElement(name = "UUconcat_id")
    private String UUconcat_id;
    /**
     * 团号或者演出座位信息
     */
    @XmlElement(name = "UUseries")
    private String UUseries;
    /**
     * 订单备注
     */
    @XmlElement(name = "UUmemo")
    private String UUmemo;

    /**
     * 景区名称
     */
    @XmlElement(name = "UUltitle")
    private String UUltitle;

    /**
     * 产品类型 A 景区B线路C 景点H演出G餐饮F套票
     */
    @XmlElement(name = "UUp_type")
    private String UUp_type;

    /**
     * 门票名称
     */
    @XmlElement(name = "UUttitle")
    private String UUttitle;
    /**
     * 门市价
     */
    @XmlElement(name = "UUMprice")
    private String UUMprice;
    /**
     * 分销商名称
     */
    @XmlElement(name = "UUdname")
    private String UUdname;
    /**
     * 已取消数量
     */
    @XmlElement(name = "UUtnum_cancel")
    private String UUtnum_cancel;
    /**
     * 已验证数量
     */
    @XmlElement(name = "UUtnum_used")
    private String UUtnum_used;
    /**
     * 是否取票 0 已打印1 未打印
     */
    @XmlElement(name = "UUifprint")
    private String UUifprint;

    public String getUUmember() {
        return UUmember;
    }

    public void setUUmember(String UUmember) {
        this.UUmember = UUmember;
    }

    public String getUUordernum() {
        return UUordernum;
    }

    public void setUUordernum(String UUordernum) {
        this.UUordernum = UUordernum;
    }

    public String getUUremotenum() {
        return UUremotenum;
    }

    public void setUUremotenum(String UUremotenum) {
        this.UUremotenum = UUremotenum;
    }

    public String getUUlid() {
        return UUlid;
    }

    public void setUUlid(String UUlid) {
        this.UUlid = UUlid;
    }

    public String getUUtid() {
        return UUtid;
    }

    public void setUUtid(String UUtid) {
        this.UUtid = UUtid;
    }

    public String getUUpid() {
        return UUpid;
    }

    public void setUUpid(String UUpid) {
        this.UUpid = UUpid;
    }

    public String getUUbegintime() {
        return UUbegintime;
    }

    public void setUUbegintime(String UUbegintime) {
        this.UUbegintime = UUbegintime;
    }

    public String getUUordertime() {
        return UUordertime;
    }

    public void setUUordertime(String UUordertime) {
        this.UUordertime = UUordertime;
    }

    public String getUUendtime() {
        return UUendtime;
    }

    public void setUUendtime(String UUendtime) {
        this.UUendtime = UUendtime;
    }

    public String getUUtnum() {
        return UUtnum;
    }

    public void setUUtnum(String UUtnum) {
        this.UUtnum = UUtnum;
    }

    public String getUUtprice() {
        return UUtprice;
    }

    public void setUUtprice(String UUtprice) {
        this.UUtprice = UUtprice;
    }

    public String getUUordername() {
        return UUordername;
    }

    public void setUUordername(String UUordername) {
        this.UUordername = UUordername;
    }

    public String getUUordertel() {
        return UUordertel;
    }

    public void setUUordertel(String UUordertel) {
        this.UUordertel = UUordertel;
    }

    public String getUUstatus() {
        return UUstatus;
    }

    public void setUUstatus(String UUstatus) {
        this.UUstatus = UUstatus;
    }

    public String getUUsalerid() {
        return UUsalerid;
    }

    public void setUUsalerid(String UUsalerid) {
        this.UUsalerid = UUsalerid;
    }

    public String getUUdtime() {
        return UUdtime;
    }

    public void setUUdtime(String UUdtime) {
        this.UUdtime = UUdtime;
    }

    public String getUUtotalmoney() {
        return UUtotalmoney;
    }

    public void setUUtotalmoney(String UUtotalmoney) {
        this.UUtotalmoney = UUtotalmoney;
    }

    public String getUUpmode() {
        return UUpmode;
    }

    public void setUUpmode(String UUpmode) {
        this.UUpmode = UUpmode;
    }

    public String getUUordermode() {
        return UUordermode;
    }

    public void setUUordermode(String UUordermode) {
        this.UUordermode = UUordermode;
    }

    public String getUUctime() {
        return UUctime;
    }

    public void setUUctime(String UUctime) {
        this.UUctime = UUctime;
    }

    public String getUUcode() {
        return UUcode;
    }

    public void setUUcode(String UUcode) {
        this.UUcode = UUcode;
    }

    public String getUUcontacttel() {
        return UUcontacttel;
    }

    public void setUUcontacttel(String UUcontacttel) {
        this.UUcontacttel = UUcontacttel;
    }

    public String getUUaid() {
        return UUaid;
    }

    public void setUUaid(String UUaid) {
        this.UUaid = UUaid;
    }

    public String getUUifpack() {
        return UUifpack;
    }

    public void setUUifpack(String UUifpack) {
        this.UUifpack = UUifpack;
    }

    public String getUUpack_order() {
        return UUpack_order;
    }

    public void setUUpack_order(String UUpack_order) {
        this.UUpack_order = UUpack_order;
    }

    public String getUUsmserror() {
        return UUsmserror;
    }

    public void setUUsmserror(String UUsmserror) {
        this.UUsmserror = UUsmserror;
    }

    public String getUUrefund_num() {
        return UUrefund_num;
    }

    public void setUUrefund_num(String UUrefund_num) {
        this.UUrefund_num = UUrefund_num;
    }

    public String getUUverified_num() {
        return UUverified_num;
    }

    public void setUUverified_num(String UUverified_num) {
        this.UUverified_num = UUverified_num;
    }

    public String getUUorigin_num() {
        return UUorigin_num;
    }

    public void setUUorigin_num(String UUorigin_num) {
        this.UUorigin_num = UUorigin_num;
    }

    public String getUUlprice() {
        return UUlprice;
    }

    public void setUUlprice(String UUlprice) {
        this.UUlprice = UUlprice;
    }

    public String getUUplaytime() {
        return UUplaytime;
    }

    public void setUUplaytime(String UUplaytime) {
        this.UUplaytime = UUplaytime;
    }

    public String getUUpay_status() {
        return UUpay_status;
    }

    public void setUUpay_status(String UUpay_status) {
        this.UUpay_status = UUpay_status;
    }

    public String getUUconcat_id() {
        return UUconcat_id;
    }

    public void setUUconcat_id(String UUconcat_id) {
        this.UUconcat_id = UUconcat_id;
    }

    public String getUUseries() {
        return UUseries;
    }

    public void setUUseries(String UUseries) {
        this.UUseries = UUseries;
    }

    public String getUUmemo() {
        return UUmemo;
    }

    public void setUUmemo(String UUmemo) {
        this.UUmemo = UUmemo;
    }

    public String getUUltitle() {
        return UUltitle;
    }

    public void setUUltitle(String UUltitle) {
        this.UUltitle = UUltitle;
    }

    public String getUUp_type() {
        return UUp_type;
    }

    public void setUUp_type(String UUp_type) {
        this.UUp_type = UUp_type;
    }

    public String getUUttitle() {
        return UUttitle;
    }

    public void setUUttitle(String UUttitle) {
        this.UUttitle = UUttitle;
    }

    public String getUUMprice() {
        return UUMprice;
    }

    public void setUUMprice(String UUMprice) {
        this.UUMprice = UUMprice;
    }

    public String getUUdname() {
        return UUdname;
    }

    public void setUUdname(String UUdname) {
        this.UUdname = UUdname;
    }

    public String getUUtnum_cancel() {
        return UUtnum_cancel;
    }

    public void setUUtnum_cancel(String UUtnum_cancel) {
        this.UUtnum_cancel = UUtnum_cancel;
    }

    public String getUUtnum_used() {
        return UUtnum_used;
    }

    public void setUUtnum_used(String UUtnum_used) {
        this.UUtnum_used = UUtnum_used;
    }

    public String getUUifprint() {
        return UUifprint;
    }

    public void setUUifprint(String UUifprint) {
        this.UUifprint = UUifprint;
    }
}
