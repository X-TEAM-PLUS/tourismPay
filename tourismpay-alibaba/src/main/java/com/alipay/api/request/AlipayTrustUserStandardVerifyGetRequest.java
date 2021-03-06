package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayTrustUserStandardVerifyGetResponse;

/**
 * ALIPAY API: alipay.trust.user.standard.verify.get request
 * 
 * @author auto create
 * @since 1.0, 2015-02-06 13:10:24
 */
public class AlipayTrustUserStandardVerifyGetRequest implements AlipayRequest<AlipayTrustUserStandardVerifyGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 详见说明文档和代码样例
	 */
	private String aliTrustUserInfo;

	public void setAliTrustUserInfo(String aliTrustUserInfo) {
		this.aliTrustUserInfo = aliTrustUserInfo;
	}
	public String getAliTrustUserInfo() {
		return this.aliTrustUserInfo;
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
		return "alipay.trust.user.standard.verify.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("ali_trust_user_info", this.aliTrustUserInfo);
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

	public Class<AlipayTrustUserStandardVerifyGetResponse> getResponseClass() {
		return AlipayTrustUserStandardVerifyGetResponse.class;
	}
}
