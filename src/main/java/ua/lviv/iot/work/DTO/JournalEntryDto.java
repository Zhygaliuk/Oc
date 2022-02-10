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
public class JournalEntryDto {
    private Integer id;
    private String author_name;
    private String  description;
    private String state;
    private Date date_of_entry;
    private String countermeasure;

}
