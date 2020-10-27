package br.com.flaviohenrique.loggingWithLombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flaviohenrique.loggingWithLombok.domine.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/people")
public class ControllerPerson {

	@GetMapping("/{name}")
	public Person namePerson(@PathVariable String name) {
		log.info("chamada ao Endpoint NamePerson");
		var person = new Person();
		if(name.length() <= 10) {
			person.setNome(name);
		}else {
			log.error("O nome não pode possuir mais de 10 caracteres");
		}
		return person;
	}
	
}
