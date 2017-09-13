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
        "date",
        "storage",
        "remain",
        "buy_price",
        "retail_price"
})
public class GetRealTimeStorageResonse {
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
     * 价格日期
     */
    @XmlElement(name = "date")
    private Date date;

    /**
     * 总库存-1 表示无限
     */
    @XmlElement(name = "storage")
    private int storage;

    /**
     * 实时库存 9999999 表示无限
     */
    @XmlElement(name = "remain")
    private int remain;

    /**
     * 结算价单位:分
     */
    @XmlElement(name = "buy_price")
    private int buy_price;

    /**
     * 零售价单位:分
     */
    @XmlElement(name = "retail_price")
    private int retail_price;

}
