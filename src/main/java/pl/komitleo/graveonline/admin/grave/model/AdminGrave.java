package pl.komitleo.graveonline.admin.grave.model;

import pl.komitleo.graveonline.admin.person.model.AdminPerson;

import javax.persistence.*;
import java.util.List;

@Table(name = "grave")
@Entity
public class AdminGrave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rrow_number;
    private String grave_number;
    private String place_in_rrow;
    private String sector;

}
