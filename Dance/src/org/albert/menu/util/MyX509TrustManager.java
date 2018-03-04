package org.albert.menu.util;

import java.security.cert.X509Certificate;
import java.security.cert.CertificateException;
import javax.net.ssl.X509TrustManager;


//证书管理器 用于HTTPS认证
// @Author Wenjian Lu
//date 2017.10.31

public class MyX509TrustManager implements X509TrustManager {
	 
	  // Method descriptor #14 ([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
	  public  void checkClientTrusted(X509Certificate[] arg0, java.lang.String arg1) throws CertificateException{
	  }
	  
	  
	  // Method descriptor #14 ([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
	  public  void checkServerTrusted(X509Certificate[] arg0, java.lang.String arg1) throws java.security.cert.CertificateException{
	  }
	  
	  
	  // Method descriptor #13 ()[Ljava/security/cert/X509Certificate;
	  public  X509Certificate[] getAcceptedIssuers(){
		  return null;
	  }

}
