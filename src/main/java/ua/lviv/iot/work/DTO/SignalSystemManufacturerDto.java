package ua.lviv.iot.work.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder



public class SignalSystemManufacturerDto {
    private Integer id;
    private String name ;
    private String phone;
    private String advertisment;


}
