package com.cxy.demo.spring_boot_demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestService {
	
	@RequestMapping(value = "hello", method = {RequestMethod.GET})
	public Map<String, Object> test(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", "hello world");
		return map;
	}
}
