package com.xteam.tourismpay.dto;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Data")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
        "getTicketListResponse"
})
public class GetTicketListResponseData {
    @XmlElement(name = "Rec")
    private GetTicketListResponse[] getTicketListResponse;

    public GetTicketListResponse[] getGetTicketListResponse() {
        return getTicketListResponse;
    }

    public void setGetTicketListResponse(GetTicketListResponse[] getTicketListResponse) {
        this.getTicketListResponse = getTicketListResponse;
    }
}
