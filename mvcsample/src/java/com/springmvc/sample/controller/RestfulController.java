package com.springmvc.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.sample.model.Greeting;

@RestController
@RequestMapping("/rest")
public class RestfulController {
	private final static Logger logger = LoggerFactory.getLogger(RestfulController.class);
	@RequestMapping("/greeting")
	public Greeting greeting() {
		logger.info("greeting");
		return new Greeting(2, "Content");
	}
}
