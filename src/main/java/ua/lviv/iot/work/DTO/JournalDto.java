package ua.lviv.iot.work.DTO;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JournalDto {
    private Integer id;
    private String name;
    private String journal_head;
}
