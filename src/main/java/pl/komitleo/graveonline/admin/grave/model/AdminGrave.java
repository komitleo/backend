package pl.komitleo.graveonline.admin.grave.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.komitleo.graveonline.admin.person.model.AdminPerson;

import javax.persistence.*;
import java.util.List;

@Table(name = "grave")
@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AdminGrave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rrow_number")
    private String rowNumber;
    @Column(name = "grave_number")
    private String graveNumber;
    @Column(name = "place_in_rrow")
    private String placeInRow;
    private String sector;
    @OneToMany(mappedBy = "adminGrave")
    private List<AdminPerson> personList;
}
