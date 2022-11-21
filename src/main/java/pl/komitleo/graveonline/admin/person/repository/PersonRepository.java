package pl.komitleo.graveonline.admin.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.komitleo.graveonline.admin.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
