package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class DemoContenedorOneApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello Many Word...         Estoy cambiando el texto para ver si cómo se actualiza";
	}

	@RequestMapping("/about")
	@ResponseBody	
	String about() {
		return "About Hola mundo de Many......";
	}	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoContenedorOneApplication.class, args);
	}
	


}
