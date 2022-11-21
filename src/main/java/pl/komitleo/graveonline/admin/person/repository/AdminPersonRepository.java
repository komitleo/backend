package pl.komitleo.graveonline.admin.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.komitleo.graveonline.admin.person.model.AdminPerson;

public interface AdminPersonRepository extends JpaRepository<AdminPerson, Long> {
}
