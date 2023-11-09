package pe.com.pruebatecnica.josebejar.application;

import org.springframework.stereotype.Service;
import pe.com.pruebatecnica.josebejar.domain.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonOperationServiceImpl implements PersonOperationService{


    @Override
    public List<Person> getSortListByDNI(List<Person> lisPerson) {
        lisPerson.forEach(System.out::println);
        return lisPerson.stream()
                .sorted(Comparator.comparing(Person::getDni))
                .collect(Collectors.toList());
    }
/* se agrega el toLowerCase para que pueda comparar en minuscula , porque al comparar con mayuscula sale error
*  en la comparacion*/
    @Override
    public List<Person> getSortPeopleByLastName(List<Person> lisPerson) {
        lisPerson.forEach(System.out::println);
        return lisPerson.stream()
                .sorted(Comparator.comparing(person -> person.getLastName().toLowerCase()))
                .collect(Collectors.toList());
    }
}
