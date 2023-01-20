package pl.komitleo.graveonline.admin.person.controller.dto;

import lombok.Builder;
import lombok.Getter;
import pl.komitleo.graveonline.admin.grave.model.AdminGrave;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Builder
public class AdminPersonDto {

    private String name;
    private String lastName;
    private Date dateOfDeath;
    private String age;
    private Long graveId;
}
