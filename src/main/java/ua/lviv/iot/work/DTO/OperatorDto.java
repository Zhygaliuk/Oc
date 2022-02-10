package ua.lviv.iot.work.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OperatorDto {
    private Integer id;
    private String name;
    private String surname;
    private String phone_number;
    private String CT_number;
    private Integer patrol_head;

}
