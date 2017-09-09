package com.tourismpay.api.dto;

public class ReturnCode {
    /**
     * 状态说明：0为成功,其他值为失败
     */
    private String code;

    /**
     * 返回值的具体描述，如果失败则描述失败的原因，如果成功则是订单的具体信息
     */
    private String meg;

    /**
     * 备注信息，后期拓展使用
      */
    private String remark;
}
