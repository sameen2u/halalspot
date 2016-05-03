package com.halal.web.sa.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.google.gson.Gson;

public class CommonUtil {
	private static ResourceBundle resourceBundle = ResourceBundle.getBundle("Environment");
	private static final String HOST_NAME = "API_HOST";
	private static final String PORT_NUM = "API_PORT";
	private static final ObjectMapper mapper = new ObjectMapper();
	private static final ObjectReader reader = mapper.reader(HashMap.class);
	public static Gson gson = new Gson();
	
	public static String buildUrl(String endPointUrl, Map<String, String> requestProperty){
		String host = resourceBundle.getString(HOST_NAME);
		String port = resourceBundle.getString(PORT_NUM);
		String serviceUrl;
		serviceUrl = host+":"+port+"/"+endPointUrl;
		if(requestProperty !=null && !requestProperty.isEmpty()){
			return serviceUrl+constructQuery(requestProperty);
		}
		return serviceUrl;
	}
	
	public static String constructQuery(Map<String, String> requestProperty) {
		StringBuilder query = new StringBuilder();
		for (Map.Entry<String, String> entry : requestProperty.entrySet()) {
			if (entry.getValue() != null) {
				query.append(entry.getKey());
				query.append("=");
				query.append(entry.getValue());
				query.append("&");
			}
		}
		// Removing unwanted & char at the end of the url String.
		return StringUtils.removeEnd(query.toString(), "&");
	}
	
	public static Object buildDomainMap(String responseString) {
		Map<String,Object> domainMap = null;
		if(responseString.length() > 0){
			try {
				domainMap = reader.readValue(responseString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return domainMap;
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, Object> buildMapFromObject(Object object){
		ObjectMapper mapper = new ObjectMapper();
		return mapper.convertValue(object, Map.class);
	}
	
	/*	
	public static String encriptString(String inputString){
		byte[]   bytesEncoded = Base64.encodeBase64(inputString.getBytes());
		return new String(bytesEncoded);
	}
	
	public static String decryptString(String inputString){
		byte[] valueDecoded= Base64.decodeBase64(inputString);
		return new String(valueDecoded);
	}
	
	public static boolean isSessionValid(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		String sessionToken= CommonUtil.decryptString(CookieUtil.getCookie(request, "SESSION_TOKEN"));
		if(session!=null){
			if(StringUtils.equals(session.getId(), sessionToken)){
				return true;
			}
		}
//		response.sendRedirect("/Browse/servlet/account/login/loginPageRedirect");
		return false;
	}*/
}
