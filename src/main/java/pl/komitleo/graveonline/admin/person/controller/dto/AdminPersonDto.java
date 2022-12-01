package pl.komitleo.graveonline.admin.person.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
public class AdminPersonDto {

    private String name;
    private String last_name;
    private Date date_of_death;
    private String age;
}
