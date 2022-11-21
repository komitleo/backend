package pl.komitleo.graveonline.admin.person.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.komitleo.graveonline.admin.person.model.Person;
import pl.komitleo.graveonline.admin.person.service.PersonService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public List<Person> getAllPerson(){
        return personService.getPersons();
    }
}
