package pl.komitleo.graveonline.admin.grave.repository;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;

import java.util.List;
import java.util.Set;

public interface AdminGraveRepository extends JpaRepository<AdminGrave, Long> {

    @Query ("SELECT g FROM AdminGrave g JOIN g.personList p WHERE p.lastName=:lastName")
    Set<AdminGrave> findAdminGraveByPersonsLastName(@Param("lastName") String lastName);


}

