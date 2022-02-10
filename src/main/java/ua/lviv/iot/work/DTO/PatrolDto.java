package ua.lviv.iot.work.DTO;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatrolDto{
    private Integer id;
    private Integer operators_number;
    private Integer head_id;
    private  String name;
}

