package pl.komitleo.graveonline.admin.person.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.komitleo.graveonline.admin.person.model.Person;
import pl.komitleo.graveonline.admin.person.repository.PersonRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getPersons(){
        return personRepository.findAll();
    }
}
