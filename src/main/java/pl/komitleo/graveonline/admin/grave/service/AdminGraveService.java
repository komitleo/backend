package pl.komitleo.graveonline.admin.grave.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;
import pl.komitleo.graveonline.admin.grave.repository.AdminGraveRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AdminGraveService {

    private final AdminGraveRepository adminGraveRepository;

    public List<AdminGrave> getGraves(){
        return adminGraveRepository.findAll();
    }
    public AdminGrave getGrave(Long id){
        return adminGraveRepository.findById(id).orElseThrow();
    }
    public AdminGrave saveGrave(AdminGrave grave){
        return adminGraveRepository.save(grave);
    }
    public AdminGrave updateGrave(AdminGrave grave){
        return adminGraveRepository.save(grave);
    }
}
