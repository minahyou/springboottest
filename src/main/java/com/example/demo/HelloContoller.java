package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
	
	// http://127.0.0.1:8080/userinfo
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello";
				
	}
	
	@RequestMapping("/userinfo")
	HashMap<String, String> userinfo()
	{
		HashMap<String, String> map =
				new HashMap<String, String> ();
		map.put("name", "홍길동");
		map.put("age","23");
		return map;
				
	}

}
