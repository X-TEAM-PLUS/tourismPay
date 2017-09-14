package com.xteam.tourismpay.dto;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Rec")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rec", propOrder = {
        "getRealTimeStorageResonse"
})
public class GetRealTimeStorageResonseData {
    @XmlElement(name = "items")
    private GetRealTimeStorageResonse getRealTimeStorageResonse;

    public GetRealTimeStorageResonse getGetRealTimeStorageResonse() {
        return getRealTimeStorageResonse;
    }

    public void setGetRealTimeStorageResonse(GetRealTimeStorageResonse getRealTimeStorageResonse) {
        this.getRealTimeStorageResonse = getRealTimeStorageResonse;
    }
}
