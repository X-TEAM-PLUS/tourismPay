package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayWapUserAlipayinsideAuthapiResponse;

/**
 * ALIPAY API: alipay.wap.user.alipayinside.authapi request
 * 
 * @author auto create
 * @since 1.0, 2015-01-15 17:38:15
 */
public class AlipayWapUserAlipayinsideAuthapiRequest implements AlipayRequest<AlipayWapUserAlipayinsideAuthapiResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* {client_id:'222122',realName='加密',certNo='3310231111111111'}，json直接加密。
	 */
	private String contextParams;

	public void setContextParams(String contextParams) {
		this.contextParams = contextParams;
	}
	public String getContextParams() {
		return this.contextParams;
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
		return "alipay.wap.user.alipayinside.authapi";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("context_params", this.contextParams);
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

	public Class<AlipayWapUserAlipayinsideAuthapiResponse> getResponseClass() {
		return AlipayWapUserAlipayinsideAuthapiResponse.class;
	}
}
