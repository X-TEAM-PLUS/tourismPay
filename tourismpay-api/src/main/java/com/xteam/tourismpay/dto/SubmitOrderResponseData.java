package com.xteam.tourismpay.dto;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Data")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
        "submitOrderResponse"
})
public class SubmitOrderResponseData {
    @XmlElement(name = "Rec")
    private SubmitOrderResponse submitOrderResponse;

    public SubmitOrderResponse getSubmitOrderResponse() {
        return submitOrderResponse;
    }

    public void setSubmitOrderResponse(SubmitOrderResponse submitOrderResponse) {
        this.submitOrderResponse = submitOrderResponse;
    }
}
