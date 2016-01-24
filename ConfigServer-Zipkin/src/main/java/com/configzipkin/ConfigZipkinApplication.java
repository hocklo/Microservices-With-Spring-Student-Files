package com.configzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigZipkinApplication.class, args);
	}
	
	@Bean
	  public AlwaysSampler defaultSampler() {
	    return new AlwaysSampler();
	  }

	  @RequestMapping("/")
	  public String home() {
	    return "Hello World";
	  }
}
