package com.lxx;

import com.lxx.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch623Application {

	@Autowired
	private AuthorSettings settings;

	@RequestMapping(value = "/")
	public String setting(){
		return "name:"+ settings.getName()+"，age:"+settings.getAge();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ch623Application.class, args);
	}

}
