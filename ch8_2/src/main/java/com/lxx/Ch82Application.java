package com.lxx;

import com.lxx.support.CustomFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomFactoryBean.class)
public class Ch82Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch82Application.class, args);
	}

}
