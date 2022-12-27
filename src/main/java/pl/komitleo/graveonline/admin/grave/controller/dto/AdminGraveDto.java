package pl.komitleo.graveonline.admin.grave.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AdminGraveDto {

    private String rowNumber;
    private String graveNumber;
    private String placeInRow;
    private String sector;

}
