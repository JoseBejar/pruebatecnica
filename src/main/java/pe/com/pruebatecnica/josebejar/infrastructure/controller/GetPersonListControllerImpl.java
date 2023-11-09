package pe.com.pruebatecnica.josebejar.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pe.com.pruebatecnica.josebejar.application.PersonOperationService;
import pe.com.pruebatecnica.josebejar.domain.Person;

import java.util.List;

@RestController
public class GetPersonListControllerImpl implements GetPersonListController{

    private final PersonOperationService personOperationService;

    public GetPersonListControllerImpl(PersonOperationService personOperationService) {
        this.personOperationService = personOperationService;
    }

    @Override
    public ResponseEntity<List<Person>> getSortedPersonList(List<Person> listPerson) {
        return ResponseEntity.ok(personOperationService.getSortListByDNI(listPerson));
    }

    @Override
    public ResponseEntity<List<Person>> getSortPeopleByLastName(List<Person> listPerson) {
        return ResponseEntity.ok(personOperationService.getSortPeopleByLastName(listPerson));
    }
}
