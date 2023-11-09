package pe.com.pruebatecnica.josebejar.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.com.pruebatecnica.josebejar.domain.Person;

import java.util.List;

@RequestMapping(value = "api/v1/personService")
public interface GetPersonListController {

    @PostMapping(value = "/getSortedPersonList")
    ResponseEntity<List<Person>> getSortedPersonList(@RequestBody List<Person> listPerson);

    @PostMapping(value = "/getSortPeopleByLastName")
    ResponseEntity<List<Person>> getSortPeopleByLastName(@RequestBody List<Person> listPerson);


}
