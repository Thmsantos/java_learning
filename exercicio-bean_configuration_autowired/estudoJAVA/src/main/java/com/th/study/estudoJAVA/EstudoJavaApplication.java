package com.th.study.estudoJAVA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class EstudoJavaApplication{
	@Autowired
	@Qualifier("jsonTest")
	private String jsonTest;

	@GetMapping("/mostrar")
	public String JsonTest(){
		return jsonTest;
	}

	public static void main(String[] args) {
		SpringApplication.run(EstudoJavaApplication.class, args);
	}

}
