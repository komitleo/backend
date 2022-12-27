package pl.komitleo.graveonline.admin.grave.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import pl.komitleo.graveonline.admin.grave.controller.dto.AdminGraveDto;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;
import pl.komitleo.graveonline.admin.grave.service.AdminGraveService;
import pl.komitleo.graveonline.admin.person.controller.dto.AdminPersonDto;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Getter
@RestController
public class AdminGraveController {

    public static final Long EMPTY_ID = null;
    private final AdminGraveService graveService;

    @GetMapping("admin/graves")
    public List<AdminGrave> getAllGraves(){
        return graveService.getGraves();
    }

    @GetMapping("admin/graves/persons/{lastName}")
    public Set<AdminGrave> getGraveByPersonLastName(@PathVariable String lastName ){
         return graveService.getGraveByPersonLastName(lastName);
    }

    @GetMapping("admin/graves/{id}")
    public AdminGrave getGrave(@PathVariable Long id){
        return graveService.getGrave(id);
    }

    @PostMapping("admin/graves")
    public AdminGrave createGrave(@RequestBody  AdminGraveDto adminGraveDto){
        return graveService.saveGrave(mapAdminGrave(adminGraveDto, EMPTY_ID));
    }

    @PutMapping("admin/graves/{id}")
    public AdminGrave updateGrave(@RequestBody AdminGraveDto adminGraveDto, @PathVariable Long id){
        return graveService.updateGrave(mapAdminGrave(adminGraveDto, id));
    }

    private AdminGrave mapAdminGrave(@RequestBody AdminGraveDto adminGraveDto, @PathVariable Long id){
       return AdminGrave.builder()
               .id(id)
               .placeInRow(adminGraveDto.getPlaceInRow())
               .graveNumber(adminGraveDto.getGraveNumber())
               .rowNumber(adminGraveDto.getRowNumber())
               .sector(adminGraveDto.getSector())
               .build();
    }
}
