package ua.lviv.iot.work.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ControlZoneDto {
    private Integer id;
    private String name;
    private Integer area;
    private String zone_type;
    private Integer campus_id;
}
