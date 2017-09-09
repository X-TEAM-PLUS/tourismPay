package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaymentAbilityPostbackResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.databiz.core.payment.ability.update response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:17:00
 */
public class AlipayDatabizCorePaymentAbilityUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2195843875773842767L;

	/** 
	 * 支付能力回传信息结果信息
	 */
	@ApiField("payment_ability_postback_response")
	private PaymentAbilityPostbackResponse paymentAbilityPostbackResponse;

	public void setPaymentAbilityPostbackResponse(PaymentAbilityPostbackResponse paymentAbilityPostbackResponse) {
		this.paymentAbilityPostbackResponse = paymentAbilityPostbackResponse;
	}
	public PaymentAbilityPostbackResponse getPaymentAbilityPostbackResponse( ) {
		return this.paymentAbilityPostbackResponse;
	}

}