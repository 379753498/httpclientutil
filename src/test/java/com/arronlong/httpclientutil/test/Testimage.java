package com.arronlong.httpclientutil.test;  

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.exception.HttpProcessException;
  
public class Testimage {
public static void main(String[] args) throws FileNotFoundException, HttpProcessException {
	
	
	String imgUrl = "http://localhost/SpringMVCmybatis/checkUser.do";
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("username", "xujian");
	
	System.out.println(new Date());
	HttpConfig custom = HttpConfig.custom().url(imgUrl).map(map);
	
	

	
	
	
	for (int i = 0; i < 10000; i++) {
		
//		long a= new Date().getTime();
		HttpClientUtil.post(custom);
//		long b= new Date().getTime();
//		System.out.println(b-a);

	}
	
	System.out.println(new Date());
}

}
