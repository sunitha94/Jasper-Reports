package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan("com.ravi")
public class SpringBootJasperReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJasperReportsApplication.class, args);
	}
}
