package ua.lviv.iot.work.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CampusDto {
    private Integer id;
    private String name;
    private String adress;
}
