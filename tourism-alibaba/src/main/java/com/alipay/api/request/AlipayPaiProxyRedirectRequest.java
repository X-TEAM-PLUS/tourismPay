package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayPaiProxyRedirectResponse;

/**
 * ALIPAY API: alipay.pai.proxy.redirect request
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:12
 */
public class AlipayPaiProxyRedirectRequest implements AlipayRequest<AlipayPaiProxyRedirectResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 跳转的地址
	 */
	private String toUrl;

	public void setToUrl(String toUrl) {
		this.toUrl = toUrl;
	}
	public String getToUrl() {
		return this.toUrl;
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
		return "alipay.pai.proxy.redirect";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("to_url", this.toUrl);
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

	public Class<AlipayPaiProxyRedirectResponse> getResponseClass() {
		return AlipayPaiProxyRedirectResponse.class;
	}
}
