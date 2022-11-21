package pl.komitleo.graveonline.admin.person.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
public class AdminPersonDto {

    private String name;
    private String last_name;
    private String rrow;
    private String place_in_rrow;
    private String sector;
    private Date date_of_death;
    private int age;
    private int grave_number;
}
