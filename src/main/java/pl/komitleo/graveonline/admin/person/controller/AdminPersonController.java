package pl.komitleo.graveonline.admin.person.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;
import pl.komitleo.graveonline.admin.person.controller.dto.AdminPersonDto;
import pl.komitleo.graveonline.admin.person.model.AdminPerson;
import pl.komitleo.graveonline.admin.person.service.AdminPersonService;

import java.util.List;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class AdminPersonController {

    public static final Long EMPTY_ID = null;
    private final AdminPersonService adminPersonService;

    @GetMapping("admin/persons")
    public List<AdminPerson> getAllPerson(){
        return adminPersonService.getPersons();
    }

    @GetMapping("admin/persons/{id}")
    public AdminPerson getPerson(@PathVariable Long id){
        return adminPersonService.getPerson(id);
    }

    @GetMapping("admin/persons/name/{name}")
    public List<AdminPerson> getPersonByLastName(@PathVariable String name){
        return adminPersonService.findByLastName(name);
    }

    @PostMapping("admin/persons")
    public AdminPerson createPerson(@RequestBody AdminPersonDto adminPersonDto){
        return adminPersonService.createPerson(mapAdminPerson(adminPersonDto, EMPTY_ID));
    }

    @PutMapping("admin/persons/{id}")
    public AdminPerson updatePerson(@RequestBody AdminPersonDto adminPersonDto, @PathVariable Long id){
        return adminPersonService.updatePerson(mapAdminPerson(adminPersonDto, id));
    }

    private AdminPerson mapAdminPerson(@RequestBody AdminPersonDto adminPersonDto, @PathVariable Long id) {
        return AdminPerson.builder()
                .id(id)
                .name(adminPersonDto.getName())
                .lastName(adminPersonDto.getLastName())
                .age(adminPersonDto.getAge())
                .dateOfDeath(adminPersonDto.getDateOfDeath())
                .build();
    }
}
