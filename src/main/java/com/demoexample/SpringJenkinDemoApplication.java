package com.demoexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demoexample")

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringJenkinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinDemoApplication.class, args);
	}

}
