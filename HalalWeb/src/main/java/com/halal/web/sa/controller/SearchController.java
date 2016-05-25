package com.halal.web.sa.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.halal.web.sa.core.exception.ApplicationException;
import com.halal.web.sa.service.BaseService;
import com.halal.web.sa.service.SearchService;

@Controller
@RequestMapping(value="/searchBiz")
public class SearchController extends BaseController{
	
	@Autowired
	SearchService searchService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView searchKeyword(HttpServletRequest request, HttpServletResponse response, ModelAndView modelAndView) throws ApplicationException{
		modelAndView.setViewName("search/searchResult");
		return super.performExecute(request, response, modelAndView);
	}

	@Override
	protected BaseService getAPIServiceProvider() {
		return searchService;
	}

	@Override
	protected void processResponse(ModelAndView modelAndView, Map<String, Object> globalMap) {
		modelAndView.addObject("globalMap", globalMap);
	}
}
