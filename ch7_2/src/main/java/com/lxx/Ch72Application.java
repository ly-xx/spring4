package com.lxx;

import com.lxx.wisely.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class Ch72Application {


	@RequestMapping(value = "/index")
	public String index(Model model){
		Person single = new Person("person_0", 23);

		List<Person> people = new ArrayList<>();
		people.add(new Person("test1", 23));
		people.add(new Person("test2", 18));
		people.add(new Person("test3", 20));

		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(Ch72Application.class, args);
	}

}
