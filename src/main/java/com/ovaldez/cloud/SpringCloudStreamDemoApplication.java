package com.ovaldez.cloud;

import java.util.function.Consumer;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudStreamDemoApplication {

	
	private static final Logger log = LoggerFactory.getLogger(SpringCloudStreamDemoApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamDemoApplication.class, args);
	}
	
	//toUpperCase-in-0
	//toUpperCase-out-0
	@Bean
	public Function<String, String> toUpperCase(){
		return value -> value.toUpperCase();
	}
	
	//data-in-0
	//data-out-0
	@Bean
	public Function<String, String> data(){
		return value -> value;
	}
	
	//consumer-in-0
	@Bean
	public Consumer<String> consumer(){
		return value -> log.info("value is:"+value);
	}

}
