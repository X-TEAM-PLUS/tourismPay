package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppPdeductSignCancelResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.cancel request
 * 
 * @author auto create
 * @since 1.0, 2015-01-16 18:35:02
 */
public class AlipayEbppPdeductSignCancelRequest implements AlipayRequest<AlipayEbppPdeductSignCancelResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 操作来源
PUBLICPLATFORM：服务窗
	 */
	private String agentChannel;

	/** 
	* 标识发起方的ID，从服务窗发起则为publicId的值
	 */
	private String agentCode;

	/** 
	* 支付宝代扣协议ID
	 */
	private String agreementId;

	/** 
	* 通过调起极简客户端进行支付密码验证获得的token
	 */
	private String payPasswordToken;

	/** 
	* 通过服务窗拿到的openId（即加密后的userID）
	 */
	private String userId;

	public void setAgentChannel(String agentChannel) {
		this.agentChannel = agentChannel;
	}
	public String getAgentChannel() {
		return this.agentChannel;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId() {
		return this.agreementId;
	}

	public void setPayPasswordToken(String payPasswordToken) {
		this.payPasswordToken = payPasswordToken;
	}
	public String getPayPasswordToken() {
		return this.payPasswordToken;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.ebpp.pdeduct.sign.cancel";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_channel", this.agentChannel);
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("agreement_id", this.agreementId);
		txtParams.put("pay_password_token", this.payPasswordToken);
		txtParams.put("user_id", this.userId);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayEbppPdeductSignCancelResponse> getResponseClass() {
		return AlipayEbppPdeductSignCancelResponse.class;
	}
}
