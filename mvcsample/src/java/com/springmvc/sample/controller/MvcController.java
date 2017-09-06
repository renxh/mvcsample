package com.springmvc.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample")
public class MvcController {
	private final static Logger logger = LoggerFactory.getLogger(MvcController.class);

	@RequestMapping("/hello")
	public ModelAndView toHome() {
		logger.debug("toHome");
		ModelAndView modelAndView = new ModelAndView("sample");
		modelAndView.addObject("info", "world");
		return modelAndView;
	}

	@RequestMapping("/hello2")
	public String toHome2(Model model) {
		logger.info("toHome2");
		model.addAttribute("info", "world2");
		return "sample";
	}

	/*
	@RequestMapping("/hello3")
	public String toHome3(Model model) {
		model.addAttribute("info", "world3");
		return "subview/subsample";
	}*/
}
