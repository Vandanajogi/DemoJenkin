package com.demoexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpringController {
	
	@RequestMapping("/welcome")
	public String methodofstring() {
		return "Welcome";

	}

}
