package com.xteam.tourismpay.dto;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Data")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
        "orderQueryResonse"
})
public class QueryOrderResponseData {
    @XmlElement(name = "Rec")
    private OrderQueryResonse orderQueryResonse;

    public OrderQueryResonse getOrderQueryResonse() {
        return orderQueryResonse;
    }

    public void setOrderQueryResonse(OrderQueryResonse orderQueryResonse) {
        this.orderQueryResonse = orderQueryResonse;
    }
}
