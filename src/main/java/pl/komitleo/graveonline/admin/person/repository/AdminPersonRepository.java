package pl.komitleo.graveonline.admin.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;
import pl.komitleo.graveonline.admin.person.model.AdminPerson;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface AdminPersonRepository extends JpaRepository<AdminPerson, Long> {

    List<AdminPerson> findByLastName(String lastName);

}
