package pl.komitleo.graveonline.admin.person.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.komitleo.graveonline.admin.grave.controller.dto.AdminGraveDto;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Table(name = "person")
public class AdminPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private Date dateOfDeath;
    private String age;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private AdminGrave adminGrave;
}
