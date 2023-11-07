package com.example.demo;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RestController
	private static class SampleController {
		
		private final Environment env;

	    @Autowired
	    public SampleController(Environment env) {
	        this.env = env;
	    }

		@RequestMapping("/")
		public ResponseEntity<String> index() {
			return ResponseEntity.ok("completed utility start up.... use -> to hit api the http://localhost:8080/demo/test");
		}
		
		@GetMapping("/test")
		public ResponseEntity<String> test() {
			utility utils = new utility();
			utils.test(env);
			
						
			return ResponseEntity.ok("completed");
		}

	}

}
