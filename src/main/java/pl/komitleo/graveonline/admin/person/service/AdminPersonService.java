package pl.komitleo.graveonline.admin.person.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.komitleo.graveonline.admin.person.model.AdminPerson;
import pl.komitleo.graveonline.admin.person.repository.AdminPersonRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AdminPersonService {

    private final AdminPersonRepository adminPersonRepository;

    public List<AdminPerson> getPersons(){
        return adminPersonRepository.findAll();
    }
    public AdminPerson getPerson(Long id) {
        return adminPersonRepository.findById(id).orElseThrow();
    }
    public AdminPerson createPerson(AdminPerson person) {
        return adminPersonRepository.save(person);
    }
    public AdminPerson updatePerson(AdminPerson person) {
        return adminPersonRepository.save(person);
    }
}
