package ua.lviv.iot.work.DTO;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDto {
    private Integer id;
    private String name;
    private String CEO;
    private String phone_number;
    private Integer number_of_employees;
    private Date since_date;
}
