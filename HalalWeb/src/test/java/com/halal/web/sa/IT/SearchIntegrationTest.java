package com.halal.web.sa.IT;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.halal.web.sa.common.apicore.ApiService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/WEB-INF/dispatcher-servlet.xml")
public class SearchIntegrationTest {
	
	@Autowired
	ApiService apiService;
	
	RestTemplate restTemplate = new RestTemplate();

	@Test
	public void search_response_for_valid_address_keyword() {
		String url = "http://localhost:9191/HalalApi/v1/business/search?address=Camp+Pune+Maharashtra+India&keyword=chinese&distance=3";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> httpEntity = new HttpEntity<String>("sameen", headers);
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
//		String responseEntity = apiService.postMethod("", new Object(), MediaType.APPLICATION_JSON, false);
		System.out.println(responseEntity.getBody());
	}

}
