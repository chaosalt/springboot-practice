package com.chaosalt.learnSpringBoot.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${result.default}")
	String result;

	@GetMapping("/hello")
	@ResponseBody
	public String index() {

		return result;
	}
}
