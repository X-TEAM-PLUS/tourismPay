package com.xteam.tourismpay.dto;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Data")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
        "getRealTimeStorageResonse"
})
public class GetRealTimeStorageResonseData {
    @XmlElement(name = "Rec")
    private GetRealTimeStorageResonse getRealTimeStorageResonse;

    public GetRealTimeStorageResonse getGetRealTimeStorageResonse() {
        return getRealTimeStorageResonse;
    }

    public void setGetRealTimeStorageResonse(GetRealTimeStorageResonse getRealTimeStorageResonse) {
        this.getRealTimeStorageResonse = getRealTimeStorageResonse;
    }
}
