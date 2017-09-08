package com.springmvc.sample.test;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.springmvc.sample.model.Greeting;

@SuppressWarnings("unused")
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	private static final String URL_BASE = "http://localhost:8080/mvcsample/rest";

	public static void main(String args[]) {
		// testGreeting();
		// testGreetingBody();
		testGreetingParam();
	}

	private static void testGreeting() {
		RestTemplate restTemplate = new RestTemplate();
		Greeting g = restTemplate.postForObject(URL_BASE + "/greeting", null, Greeting.class);
		log.info(g.toString());
	}

	private static void testGreetingBody() {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Greeting> request = new HttpEntity<Greeting>(new Greeting(11, "bar"));
		Greeting g = restTemplate.postForObject(URL_BASE + "/greeting/body", request, Greeting.class);
		log.info(g.toString());
	}

	private static void testGreetingParam() {
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<String, String>();
		Map<String, String> in = new HashMap<String, String>();
		in.put("id", "13");
		in.put("content", "contentcontent");
		bodyMap.setAll(in);
		Greeting g = restTemplate.postForObject(URL_BASE + "/greeting/param", bodyMap, Greeting.class);
		log.info(g.toString());
	}

}