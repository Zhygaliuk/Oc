package ua.lviv.iot.work.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorDto {
    private Integer id;
    private String sensor_type;
    private Integer wireless;
    private String power_supply;
}

