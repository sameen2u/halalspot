package com.halal.web.sa.service;

import com.halal.web.sa.common.CommonUtil;
import com.halal.web.sa.common.apicore.ApiService;
import com.halal.web.sa.common.registry.ApiResponseRegistry;
import com.halal.web.sa.core.exception.ApplicationException;

import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;

public abstract class BaseService
{
  protected static ResourceBundle resourceBundle = ResourceBundle.getBundle("Application");
 
  @Autowired
  ApiService apiService;
  
  public Object executeService(HttpServletRequest request, HttpServletResponse response)
    throws ApplicationException
  {
    String serviceURL = buildServiceUrl(request);
    String responseJson = null;
    if (StringUtils.endsWithIgnoreCase(request.getMethod(), "GET"))
    {
      Map cacheMap = ApiResponseRegistry.getInstance().getCacheMap();
      if (cacheMap.containsKey(serviceURL)) {
        return CommonUtil.buildDomainMap((String)cacheMap.get(serviceURL));
      }
      responseJson = apiService.getMethod(serviceURL, isCacheable());
      if (StringUtils.isEmpty(responseJson)) {
        throw new ApplicationException("problem here- Empty JSON response String");
      }
      return CommonUtil.buildDomainMap(responseJson);
    }
    if (StringUtils.endsWithIgnoreCase(request.getMethod(), "POST"))
    {
      responseJson = apiService.postMethod(serviceURL, buildInputDataObject(request), MediaType.APPLICATION_JSON, isCacheable());
      return processResponse(responseJson, request, response);
    }
    throw new ApplicationException("Calling incorect Method, call GET or POST method");
  }
  
  protected abstract String buildRequestParam(HttpServletRequest paramHttpServletRequest);
  
  protected abstract String buildServiceUrl(HttpServletRequest paramHttpServletRequest);
  
  protected abstract Object buildInputDataObject(HttpServletRequest paramHttpServletRequest);
  
  protected abstract Object processResponse(String paramString, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse);
  
  /*protected String invokeService(String serviceURL, boolean isCacheable)
    throws ApplicationException
  {
    return this.apiService.callApiService(serviceURL, isCacheable);
  }
  
  protected String invokePostService(String serviceURL, Object jsonObj, MediaType mediaType, boolean isCacheable)
  {
    return this.apiService.callApiPostService(serviceURL, jsonObj, mediaType, isCacheable);
  }
  */
  protected boolean isCacheable()
  {
    return true;
  }
}
