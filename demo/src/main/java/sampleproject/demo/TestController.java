package sampleproject.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
	@GetMapping("/test")
	public String test() {
		return "hi";
	}

}
//TestController