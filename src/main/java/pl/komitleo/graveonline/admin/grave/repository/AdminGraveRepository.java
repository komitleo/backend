package pl.komitleo.graveonline.admin.grave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;

public interface AdminGraveRepository extends JpaRepository<AdminGrave, Long> {
}

