package pl.komitleo.graveonline.admin.grave.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;
import pl.komitleo.graveonline.admin.grave.service.AdminGraveService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("admin")
public class AdminGraveController {

    private final AdminGraveService graveService;

    @GetMapping("/graves")
    public List<AdminGrave> getAllGraves(){
        return graveService.getGraves();
    }
}
