import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.unionpay.acp.sdk.AcpService;
import com.unionpay.acp.sdk.SDKConfig;
import com.unionpay.acp.sdk.SDKUtil;


public class Test {

	public static void main(String[] args) {
		
		/*SDKConfig.getConfig().loadPropertiesFromSrc();
		
		String reqUrl = "http://localhost:8080/ACPSample_B2C/frontRcvResponse";
		Map<String, String> contentData = new HashMap<String, String>();

		contentData.put("version", "1.0.0");
		contentData.put("reqType", "0240000903");
		contentData.put("issCode", "90880019");
		
		contentData.put("qrNo", "333333333333333");
		contentData.put("respCode", "00");//可以按照规范修改应答码
		contentData.put("respMsg", "成功[0000000]");
		
		contentData.put("upReserved", "保留域");
		contentData.put("voucherNum", "2222222222222222");
		
		Map<String, String> reqData = AcpService.sign(contentData,"UTF-8");
		
		AcpService.post(reqData, reqUrl, "UTF-8");*/
		
		valid510();

		//System.out.print(System.getProperty("line.separator"));
		
		//postNotify();
	}
	
	public static void postNotify(){
String lineSepartor = System.getProperty("line.separator");

		String validStr2="accessType=0&bizType=000902&encoding=UTF-8&merId=860100048140007&orderId=201706290005178800&respCode=10&respMsg=报文格式错误[6100030]&signMethod=01&signPubKeyCert=-----BEGIN CERTIFICATE-----"+lineSepartor+
"MIIEOjCCAyKgAwIBAgIFEAJkAUkwDQYJKoZIhvcNAQEFBQAwWDELMAkGA1UEBhMC"+lineSepartor+
"Q04xMDAuBgNVBAoTJ0NoaW5hIEZpbmFuY2lhbCBDZXJ0aWZpY2F0aW9uIEF1dGhv"+lineSepartor+
"cml0eTEXMBUGA1UEAxMOQ0ZDQSBURVNUIE9DQTEwHhcNMTUxMjA0MDMyNTIxWhcN"+lineSepartor+
"MTcxMjA0MDMyNTIxWjB5MQswCQYDVQQGEwJjbjEXMBUGA1UEChMOQ0ZDQSBURVNU"+lineSepartor+
"IE9DQTExEjAQBgNVBAsTCUNGQ0EgVEVTVDEUMBIGA1UECxMLRW50ZXJwcmlzZXMx"+lineSepartor+
"JzAlBgNVBAMUHjA0MUBaMTJAMDAwNDAwMDA6U0lHTkAwMDAwMDA2MjCCASIwDQYJ"+lineSepartor+
"KoZIhvcNAQEBBQADggEPADCCAQoCggEBAMUDYYCLYvv3c911zhRDrSWCedAYDJQe"+lineSepartor+
"fJUjZKI2avFtB2/bbSmKQd0NVvh+zXtehCYLxKOltO6DDTRHwH9xfhRY3CBMmcOv"+lineSepartor+
"d2xQQvMJcV9XwoqtCKqhzguoDxJfYeGuit7DpuRsDGI0+yKgc1RY28v1VtuXG845"+lineSepartor+
"fTP7PRtJrareQYlQXghMgHFAZ/vRdqlLpVoNma5C56cJk5bfr2ngDlXbUqPXLi1j"+lineSepartor+
"iXAFb/y4b8eGEIl1LmKp3aPMDPK7eshc7fLONEp1oQ5Jd1nE/GZj+lC345aNWmLs"+lineSepartor+
"l/09uAvo4Lu+pQsmGyfLbUGR51KbmHajF4Mrr6uSqiU21Ctr1uQGkccCAwEAAaOB"+lineSepartor+
"6TCB5jAfBgNVHSMEGDAWgBTPcJ1h6518Lrj3ywJA9wmd/jN0gDBIBgNVHSAEQTA/"+lineSepartor+
"MD0GCGCBHIbvKgEBMDEwLwYIKwYBBQUHAgEWI2h0dHA6Ly93d3cuY2ZjYS5jb20u"+lineSepartor+
"Y24vdXMvdXMtMTQuaHRtMDgGA1UdHwQxMC8wLaAroCmGJ2h0dHA6Ly91Y3JsLmNm"+lineSepartor+
"Y2EuY29tLmNuL1JTQS9jcmw0NDkxLmNybDALBgNVHQ8EBAMCA+gwHQYDVR0OBBYE"+lineSepartor+
"FAFmIOdt15XLqqz13uPbGQwtj4PAMBMGA1UdJQQMMAoGCCsGAQUFBwMCMA0GCSqG"+lineSepartor+
"SIb3DQEBBQUAA4IBAQB8YuMQWDH/Ze+e+2pr/914cBt94FQpYqZOmrBIQ8kq7vVm"+lineSepartor+
"TTy94q9UL0pMMHDuFJV6Wxng4Me/cfVvWmjgLg/t7bdz0n6UNj4StJP17pkg68WG"+lineSepartor+
"zMlcjuI7/baxtDrD+O8dKpHoHezqhx7dfh1QWq8jnqd3DFzfkhEpuIt6QEaUqoWn"+lineSepartor+
"t5FxSUiykTfjnaNEEGcn3/n2LpwrQ+upes12/B778MQETOsVv4WX8oE1Qsv1XLRW"+lineSepartor+
"i0DQetTU2RXTrynv+l4kMy0h9b/Hdlbuh2s0QZqlUMXx2biy0GvpF2pR8f+OaLuT"+lineSepartor+
"AtaKdU4T2+jO44+vWNNN2VoAaw0xY6IZ3/A1GL0x"+lineSepartor+
"-----END CERTIFICATE-----&txnSubType=00&txnTime=20170629174011&txnType=77&version=5.1.0&signature=janyTEgfZfXl8EXe5STht029Hlm+v43CwCE70+jIxbAMe5a5p76BTnj3iP0E7S1ffj+/fUEKNIfDSP0tT77dVsC8Q2tm44XWcRZo/Y5a+ef9HVvujQJSPOHlpgDAW/g/onbHQmg7sPsEEPXh9FS0NugAloDR1n1Cjt53bLra6KYXtgaiWbBpIKRUDlga7eKrrC6p38sz62Q3R7kzbJkJR0ta4Q9dKfZ2X/QWmzylQYoKYheVfuOaM+m4ctZ/yvmM6SvDAe026wM7pjePiD/4fmnH4aPINaqGZzGucR84jAtKKFLHu4uk+c3yMDRkrUOm7A+/i7sJ+AwuYCfWyhD9wg";
		
		AcpService.post(SDKUtil.convertResultStringToMap(validStr2), "http://localhost:8080/ACPSample_B2C/backRcvResponse", "UTF-8");
	}
	
	
	
	public static  void  valid510(){
		
		
		SDKConfig.getConfig().loadPropertiesFromSrc();
		Map<String, String> rspData = new HashMap<String,String>();
		//String validStr = "accessType=0&bizType=000201&currencyCode=156&encoding=utf-8&merId=848116053990002&orderId=20170606101752&queryId=201706061017522973458&reqReserved=MjAxNzA2MDY0OTU3MTAxNXwzODAw&respCode=00&respMsg=成功[0000000]&settleAmt=3800&settleCurrencyCode=156&settleDate=0606&signMethod=01&signPubKeyCert=-----BEGIN CERTIFICATE-----\r\nMIIEOjCCAyKgAwIBAgIFEAJkAUkwDQYJKoZIhvcNAQEFBQAwWDELMAkGA1UEBhMC\r\nQ04xMDAuBgNVBAoTJ0NoaW5hIEZpbmFuY2lhbCBDZXJ0aWZpY2F0aW9uIEF1dGhv\r\ncml0eTEXMBUGA1UEAxMOQ0ZDQSBURVNUIE9DQTEwHhcNMTUxMjA0MDMyNTIxWhcN\r\nMTcxMjA0MDMyNTIxWjB5MQswCQYDVQQGEwJjbjEXMBUGA1UEChMOQ0ZDQSBURVNU\r\nIE9DQTExEjAQBgNVBAsTCUNGQ0EgVEVTVDEUMBIGA1UECxMLRW50ZXJwcmlzZXMx\r\nJzAlBgNVBAMUHjA0MUBaMTJAMDAwNDAwMDA6U0lHTkAwMDAwMDA2MjCCASIwDQYJ\r\nKoZIhvcNAQEBBQADggEPADCCAQoCggEBAMUDYYCLYvv3c911zhRDrSWCedAYDJQe\r\nfJUjZKI2avFtB2/bbSmKQd0NVvh+zXtehCYLxKOltO6DDTRHwH9xfhRY3CBMmcOv\r\nd2xQQvMJcV9XwoqtCKqhzguoDxJfYeGuit7DpuRsDGI0+yKgc1RY28v1VtuXG845\r\nfTP7PRtJrareQYlQXghMgHFAZ/vRdqlLpVoNma5C56cJk5bfr2ngDlXbUqPXLi1j\r\niXAFb/y4b8eGEIl1LmKp3aPMDPK7eshc7fLONEp1oQ5Jd1nE/GZj+lC345aNWmLs\r\nl/09uAvo4Lu+pQsmGyfLbUGR51KbmHajF4Mrr6uSqiU21Ctr1uQGkccCAwEAAaOB\r\n6TCB5jAfBgNVHSMEGDAWgBTPcJ1h6518Lrj3ywJA9wmd/jN0gDBIBgNVHSAEQTA/\r\nMD0GCGCBHIbvKgEBMDEwLwYIKwYBBQUHAgEWI2h0dHA6Ly93d3cuY2ZjYS5jb20u\r\nY24vdXMvdXMtMTQuaHRtMDgGA1UdHwQxMC8wLaAroCmGJ2h0dHA6Ly91Y3JsLmNm\r\nY2EuY29tLmNuL1JTQS9jcmw0NDkxLmNybDALBgNVHQ8EBAMCA+gwHQYDVR0OBBYE\r\nFAFmIOdt15XLqqz13uPbGQwtj4PAMBMGA1UdJQQMMAoGCCsGAQUFBwMCMA0GCSqG\r\nSIb3DQEBBQUAA4IBAQB8YuMQWDH/Ze+e+2pr/914cBt94FQpYqZOmrBIQ8kq7vVm\r\nTTy94q9UL0pMMHDuFJV6Wxng4Me/cfVvWmjgLg/t7bdz0n6UNj4StJP17pkg68WG\r\nzMlcjuI7/baxtDrD+O8dKpHoHezqhx7dfh1QWq8jnqd3DFzfkhEpuIt6QEaUqoWn\r\nt5FxSUiykTfjnaNEEGcn3/n2LpwrQ+upes12/B778MQETOsVv4WX8oE1Qsv1XLRW\r\ni0DQetTU2RXTrynv+l4kMy0h9b/Hdlbuh2s0QZqlUMXx2biy0GvpF2pR8f+OaLuT\r\nAtaKdU4T2+jO44+vWNNN2VoAaw0xY6IZ3/A1GL0x\r\n-----END CERTIFICATE-----&traceNo=297345&traceTime=0606101752&txnAmt=3800&txnSubType=01&txnTime=20170606101752&txnType=01&version=5.1.0&signature=EJl8uIBe98N6rjjUDN8c1nWdajTGajlBDjNmdfTQpFSwvnIsNpGuTFvqQ3mqlUUXYS0hv2vmTSbkPmEfO+c2cf5qu6ZVvQ3RF9WWX3Aun/C4yhuBIuI4TYCH+Uqtr+M/FDXZNQjEwj7YZflaf+gA8JRlXd+ejUKmEWU0pJ91Nu7X7Frre+WGs7KeMNVvQ0taPzlpNLAZ0UQVBiCnlMfwJI2SM2XmRaEzIcu+8LavTNJ2joGZ6Tqj8cs3S/cmg76uqlz/hS6sUWAQhVZm9Jj/P7u7gVMQSkDWuaTwOBhaIuDjBlb0idPleSnVfKRARHHAVcAkJ/6hRPkMZEbbgPS3vg==";
		
		String lineSepartor = System.getProperty("line.separator");
		
/*		String validStr2="accessType=0&bizType=000902&encoding=UTF-8&merId=860100048140007&orderId=201706290005178800&respCode=10&respMsg=报文格式错误[6100030]&signMethod=01&signPubKeyCert=-----BEGIN CERTIFICATE-----"+lineSepartor+
"MIIEOjCCAyKgAwIBAgIFEAJkAUkwDQYJKoZIhvcNAQEFBQAwWDELMAkGA1UEBhMC"+lineSepartor+
"Q04xMDAuBgNVBAoTJ0NoaW5hIEZpbmFuY2lhbCBDZXJ0aWZpY2F0aW9uIEF1dGhv"+lineSepartor+
"cml0eTEXMBUGA1UEAxMOQ0ZDQSBURVNUIE9DQTEwHhcNMTUxMjA0MDMyNTIxWhcN"+lineSepartor+
"MTcxMjA0MDMyNTIxWjB5MQswCQYDVQQGEwJjbjEXMBUGA1UEChMOQ0ZDQSBURVNU"+lineSepartor+
"IE9DQTExEjAQBgNVBAsTCUNGQ0EgVEVTVDEUMBIGA1UECxMLRW50ZXJwcmlzZXMx"+lineSepartor+
"JzAlBgNVBAMUHjA0MUBaMTJAMDAwNDAwMDA6U0lHTkAwMDAwMDA2MjCCASIwDQYJ"+lineSepartor+
"KoZIhvcNAQEBBQADggEPADCCAQoCggEBAMUDYYCLYvv3c911zhRDrSWCedAYDJQe"+lineSepartor+
"fJUjZKI2avFtB2/bbSmKQd0NVvh+zXtehCYLxKOltO6DDTRHwH9xfhRY3CBMmcOv"+lineSepartor+
"d2xQQvMJcV9XwoqtCKqhzguoDxJfYeGuit7DpuRsDGI0+yKgc1RY28v1VtuXG845"+lineSepartor+
"fTP7PRtJrareQYlQXghMgHFAZ/vRdqlLpVoNma5C56cJk5bfr2ngDlXbUqPXLi1j"+lineSepartor+
"iXAFb/y4b8eGEIl1LmKp3aPMDPK7eshc7fLONEp1oQ5Jd1nE/GZj+lC345aNWmLs"+lineSepartor+
"l/09uAvo4Lu+pQsmGyfLbUGR51KbmHajF4Mrr6uSqiU21Ctr1uQGkccCAwEAAaOB"+lineSepartor+
"6TCB5jAfBgNVHSMEGDAWgBTPcJ1h6518Lrj3ywJA9wmd/jN0gDBIBgNVHSAEQTA/"+lineSepartor+
"MD0GCGCBHIbvKgEBMDEwLwYIKwYBBQUHAgEWI2h0dHA6Ly93d3cuY2ZjYS5jb20u"+lineSepartor+
"Y24vdXMvdXMtMTQuaHRtMDgGA1UdHwQxMC8wLaAroCmGJ2h0dHA6Ly91Y3JsLmNm"+lineSepartor+
"Y2EuY29tLmNuL1JTQS9jcmw0NDkxLmNybDALBgNVHQ8EBAMCA+gwHQYDVR0OBBYE"+lineSepartor+
"FAFmIOdt15XLqqz13uPbGQwtj4PAMBMGA1UdJQQMMAoGCCsGAQUFBwMCMA0GCSqG"+lineSepartor+
"SIb3DQEBBQUAA4IBAQB8YuMQWDH/Ze+e+2pr/914cBt94FQpYqZOmrBIQ8kq7vVm"+lineSepartor+
"TTy94q9UL0pMMHDuFJV6Wxng4Me/cfVvWmjgLg/t7bdz0n6UNj4StJP17pkg68WG"+lineSepartor+
"zMlcjuI7/baxtDrD+O8dKpHoHezqhx7dfh1QWq8jnqd3DFzfkhEpuIt6QEaUqoWn"+lineSepartor+
"t5FxSUiykTfjnaNEEGcn3/n2LpwrQ+upes12/B778MQETOsVv4WX8oE1Qsv1XLRW"+lineSepartor+
"i0DQetTU2RXTrynv+l4kMy0h9b/Hdlbuh2s0QZqlUMXx2biy0GvpF2pR8f+OaLuT"+lineSepartor+
"AtaKdU4T2+jO44+vWNNN2VoAaw0xY6IZ3/A1GL0x"+lineSepartor+
"-----END CERTIFICATE-----&txnSubType=00&txnTime=20170629174011&txnType=77&version=5.1.0&signature=janyTEgfZfXl8EXe5STht029Hlm+v43CwCE70+jIxbAMe5a5p76BTnj3iP0E7S1ffj+/fUEKNIfDSP0tT77dVsC8Q2tm44XWcRZo/Y5a+ef9HVvujQJSPOHlpgDAW/g/onbHQmg7sPsEEPXh9FS0NugAloDR1n1Cjt53bLra6KYXtgaiWbBpIKRUDlga7eKrrC6p38sz62Q3R7kzbJkJR0ta4Q9dKfZ2X/QWmzylQYoKYheVfuOaM+m4ctZ/yvmM6SvDAe026wM7pjePiD/4fmnH4aPINaqGZzGucR84jAtKKFLHu4uk+c3yMDRkrUOm7A+/i7sJ+AwuYCfWyhD9wg";
			*/	
/*		String validStr3="txnType=21&respCode=12&acqInsCode=04012900&totalAmt=100&totalQty=2&txnSubType=02&version=5.1.0&signMethod=01&batchNo=0001&encoding=UTF-8&respMsg=批次（0001）重复[7101201]&bizType=000501&accessType=1&txnTime=20170717142201&signPubKeyCert=-----BEGIN CERTIFICATE-----"+lineSepartor+
"MIIEOjCCAyKgAwIBAgIFEAJkAUkwDQYJKoZIhvcNAQEFBQAwWDELMAkGA1UEBhMC"+lineSepartor+
"Q04xMDAuBgNVBAoTJ0NoaW5hIEZpbmFuY2lhbCBDZXJ0aWZpY2F0aW9uIEF1dGhv"+lineSepartor+
"cml0eTEXMBUGA1UEAxMOQ0ZDQSBURVNUIE9DQTEwHhcNMTUxMjA0MDMyNTIxWhcN"+lineSepartor+
"MTcxMjA0MDMyNTIxWjB5MQswCQYDVQQGEwJjbjEXMBUGA1UEChMOQ0ZDQSBURVNU"+lineSepartor+
"IE9DQTExEjAQBgNVBAsTCUNGQ0EgVEVTVDEUMBIGA1UECxMLRW50ZXJwcmlzZXMx"+lineSepartor+
"JzAlBgNVBAMUHjA0MUBaMTJAMDAwNDAwMDA6U0lHTkAwMDAwMDA2MjCCASIwDQYJ"+lineSepartor+
"KoZIhvcNAQEBBQADggEPADCCAQoCggEBAMUDYYCLYvv3c911zhRDrSWCedAYDJQe"+lineSepartor+
"fJUjZKI2avFtB2/bbSmKQd0NVvh+zXtehCYLxKOltO6DDTRHwH9xfhRY3CBMmcOv"+lineSepartor+
"d2xQQvMJcV9XwoqtCKqhzguoDxJfYeGuit7DpuRsDGI0+yKgc1RY28v1VtuXG845"+lineSepartor+
"fTP7PRtJrareQYlQXghMgHFAZ/vRdqlLpVoNma5C56cJk5bfr2ngDlXbUqPXLi1j"+lineSepartor+
"iXAFb/y4b8eGEIl1LmKp3aPMDPK7eshc7fLONEp1oQ5Jd1nE/GZj+lC345aNWmLs"+lineSepartor+
"l/09uAvo4Lu+pQsmGyfLbUGR51KbmHajF4Mrr6uSqiU21Ctr1uQGkccCAwEAAaOB"+lineSepartor+
"6TCB5jAfBgNVHSMEGDAWgBTPcJ1h6518Lrj3ywJA9wmd/jN0gDBIBgNVHSAEQTA/"+lineSepartor+
"MD0GCGCBHIbvKgEBMDEwLwYIKwYBBQUHAgEWI2h0dHA6Ly93d3cuY2ZjYS5jb20u"+lineSepartor+
"Y24vdXMvdXMtMTQuaHRtMDgGA1UdHwQxMC8wLaAroCmGJ2h0dHA6Ly91Y3JsLmNm"+lineSepartor+
"Y2EuY29tLmNuL1JTQS9jcmw0NDkxLmNybDALBgNVHQ8EBAMCA+gwHQYDVR0OBBYE"+lineSepartor+
"FAFmIOdt15XLqqz13uPbGQwtj4PAMBMGA1UdJQQMMAoGCCsGAQUFBwMCMA0GCSqG"+lineSepartor+
"SIb3DQEBBQUAA4IBAQB8YuMQWDH/Ze+e+2pr/914cBt94FQpYqZOmrBIQ8kq7vVm"+lineSepartor+
"TTy94q9UL0pMMHDuFJV6Wxng4Me/cfVvWmjgLg/t7bdz0n6UNj4StJP17pkg68WG"+lineSepartor+
"zMlcjuI7/baxtDrD+O8dKpHoHezqhx7dfh1QWq8jnqd3DFzfkhEpuIt6QEaUqoWn"+lineSepartor+
"t5FxSUiykTfjnaNEEGcn3/n2LpwrQ+upes12/B778MQETOsVv4WX8oE1Qsv1XLRW"+lineSepartor+
"i0DQetTU2RXTrynv+l4kMy0h9b/Hdlbuh2s0QZqlUMXx2biy0GvpF2pR8f+OaLuT"+lineSepartor+
"AtaKdU4T2+jO44+vWNNN2VoAaw0xY6IZ3/A1GL0x"+lineSepartor+
"-----END CERTIFICATE-----&signature=wdmQfWprlh7HfELnFdmmhM/qr9m/dpVqa/1TyNejywpXP4HJ9jqLBVkCTCIaamRkxrJnYm1SajowU5QhP47CpnvAQ31WBAAhpnN9KImsfVgMXFSqlDKiAdGX0iO+yJJgLuEgRZdx4eIKnr1aDvWoOONk1iit6PV47tM1T7vFLcRB/hmCCoUpJ0oVFPKniX5m9SjoX4lkcfPwYz1tRmtjrED74N0OqROvwpRyioHBYNqM1dbOOWWcEamXLClheAKcAif8BtUJNYe2TmvJkBy82XUlOxILJmcND7P8GZQt6Inod6x/58Wk2ygZpYQ1j1NdE4Aisc4bxJipvcF5BWgc0Q==";
		
		
		Map<String,String> tmpRspData  = SDKUtil.convertResultStringToMap(validStr3);
		rspData.putAll(tmpRspData);
		AcpService.validate(rspData, "UTF-8");*/
		
		

		
		
/*		String ss ="e2VuY3J5cHRlZEluZm89VmFpWStONHEyNVRBWW8yR2tZeStXTUd2SkJBdDVrQUJtQ3BWRitZazM4eFBYck42NW5qbXJ0cjc1a3dFa1pzeU1pRU8vSVJWbjJBUHBWQXpleC8yeU53MjhrQnQ1M0VwbmQ2cCtyWFFqRGViNjZKMzhQSXZlaEk2eGNxK0toVGtTWWpEL2J1eFYzYU9CL1A1SDRuMHJrT1JBb1dnVW1uaHhwUmV1ay92WE9KdzBLVVFoODc0V2lBdVRsR25jakRQZlNMRGpPMVR0aHM3QTIvb2laVml4blhrWFBrRFRDNWJOaVVQTWZib0dTK2prTXR5V2p1d1ZCYzZyUXFHdnVhaFl0QnplRnovRHloNXlDVUYzOVduQlZjbSs2SHFpNkgvLzhWZWE2aFZ5YmtBU2NVcUVsMHhzUjI2ZzJKVE15S2k2T1Zjemh5akxHbUE2NzFaem5nUVBnPT19";
		System.out.println(AcpService.parseCustomerInfo(ss, "UTF-8"));
		String ss2 ="BS5KmWG2QIpvegzNNOMSwtnaPOQoIaQ4zzElzWU59YfkVIRvva81f8E39X7QNt/ZK98N7I3MihfsZ3ONr7wciHrv2nWs3j6ArKOkD04sIA02Kw1b9NlKDcdP93wUS7zkQXZAsBSYBK4BxMLUZsc16SZIHxTqLUmZy35U4QacPp/ILBftI0xXS5AM/sS3Cu/GRMVgZYZaY9DFYDjUFc+HHdOiQ6XhOi2IUstloopVuHOhmOCFBdKl7au8XMSpN6zMByaZ0JipQyo/TuRdIS9shD5z1EJCOjK5R8aZKKClHHzHXy+5huLlu/PegBNqKncZrMVQ5mqQ6QAeTBOLuq5XJg==";
		*///AcpService.decryptData(ss2, "UTF-8");
		
		
		String abc ="a1wHw69Iozv/hL6kAIE5jQwmtBmqLNj5LqHAqtmd3aNq+Tj7KQJfOyTqpzEnLp4v0GvjB6Qeioe8GIAXuNk+GiFZtzyAhZopj+RMbKwm4jPyTQNScYOtp9VDGTtmo/06rVljcjSV1+qhptyzAvetWSR1K0EmEQ0ulFRWONa72+JX4iQL4HB7hMZ7Tbw8iaURJg022jjZef8OwGCRVzLmb6nISve0zsV25pYakvehq9dJYPDuVuVUxouO0YY58Djp/TdW60TlRkqncAoOstICNgMg2z2ycE2naXhTErWUY2DSjwlEZMtg39BygfL6i5JTlw5f+oqIjYzCiPAWIF6JzQ==";
		
		System.out.println(AcpService.decryptData(abc, "UTF-8"));
		
	}
}
