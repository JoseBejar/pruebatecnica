package pe.com.pruebatecnica.josebejar.application;

import pe.com.pruebatecnica.josebejar.domain.Person;

import java.util.List;

public interface PersonOperationService {

List<Person> getSortListByDNI(List<Person> lisPerson);

List<Person> getSortPeopleByLastName(List<Person> lisPerson);



}
