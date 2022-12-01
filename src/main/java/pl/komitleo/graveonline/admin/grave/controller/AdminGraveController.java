package pl.komitleo.graveonline.admin.grave.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.komitleo.graveonline.admin.grave.controller.dto.AdminGraveDto;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;
import pl.komitleo.graveonline.admin.grave.service.AdminGraveService;

import java.util.List;

@AllArgsConstructor
@RestController
public class AdminGraveController {

    public static final Long EMPTY_ID = null;
    private final AdminGraveService graveService;

    @GetMapping("admin/graves")
    public List<AdminGrave> getAllGraves(){
        return graveService.getGraves();
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
               .grave_number(adminGraveDto.getGrave_number())
               .place_in_rrow(adminGraveDto.getPlace_in_row())
               .rrow_number(adminGraveDto.getRow_number())
               .sector(adminGraveDto.getSector())
               .build();
    }
}
