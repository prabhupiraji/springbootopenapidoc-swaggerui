package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
		info=@Info(title="api documentation for employee project",
		description = "api documentation for employee project",
		version="v1.0",
		contact = @Contact(name="prabhu", email="prabhu@gmail.com",url="www.prabhupiraji.com"),
		license = @License(name="prabhu",url="piraji.com")
		),	
externalDocs=@ExternalDocumentation(description = "prabhupiraji",url="prabhupiraji")
		)
@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class SpringbootBackendApplication implements ApplicationRunner {
   public static void main(String[] args) {
      SpringApplication.run(SpringbootBackendApplication.class, args);
   }
   @Override
   public void run(ApplicationArguments arg0) throws Exception {
      System.out.println("Hello World from Application Runner");
   }
}
