package com.halal.web.sa.transformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.halal.web.sa.common.CommonUtil;
import com.halal.web.sa.common.UrlUtil;

@Component
public class SearchTransformation extends BaseTransformation{

	@Override
	public Object transformDomain(Map<String, Object> domainMap, HttpServletRequest request) {
		pagination(domainMap, request);
		return domainMap;
	}
	
	public void pagination(Map<String, Object> domainMap, HttpServletRequest request){
		String searchBaseUrl = UrlUtil.getEntireRequestURL(request);
		
		Map<String, Object> searchReport = CommonUtil.getJsonMap(domainMap, "searchReport");
		boolean isNextPage = (Boolean) searchReport.get("nextPage");
		
		//removing page parameter from the query string
		searchBaseUrl = UrlUtil.removeUrlParam(searchBaseUrl, "page");
		
		int page = (request.getParameter("page") == null) ? 1 : Integer.parseInt(request.getParameter("page"));
		int currentPage = 1;
		if(page > 1){
			currentPage  = page;
		}
		
		List<Map<String,Object>> pagesList = this.getPages(currentPage, isNextPage, searchBaseUrl);
		domainMap.put("pagination", pagesList);
	}
	
	public List<Map<String,Object>> getPages(int currentPage, boolean isNextPage, String searchBaseUrl){
		Map<String,Object> pageMap = null;
		int lastPage=currentPage;
		
		long page=0;
		if(isNextPage){
			lastPage++;
		}
		List<Map<String,Object>> pageList = new ArrayList<Map<String,Object>>();
//		pageMap.put("label", ObjectUtils.toString((index+1)));
		for(int i=1; i<=lastPage; i++){
			boolean isSelectedPage = false;
			pageMap = new HashMap<String,Object>();
			String url = searchBaseUrl;
			pageMap.put("label", i);
			if(i == currentPage){
				isSelectedPage = Boolean.TRUE;
			}
			pageMap.put("label", i);
			pageMap.put("isSelectedPage", isSelectedPage);
			
			if(i == 1){
				pageMap.put("paginationUrl", searchBaseUrl);
			}
			else{
				pageMap.put("paginationUrl", UrlUtil.addUrlParam(searchBaseUrl, "page", Integer.toString(i)));
			}
			
			pageList.add(pageMap);	
		}
		
		return pageList;
	}

}
