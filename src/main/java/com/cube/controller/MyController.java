package com.cube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021-3-8
 */
@RestController
@Slf4j
@RequestMapping("/test")
public class MyController {

	@GetMapping("/log")
	public String test() {
		log.debug("LOG TEST DEBUG");
		log.info("LOG TEST INFO");
		log.warn("LOG TEST WARN");
		log.error("LOG TEST ERROR");
		return "TEST OK";
	}

}
