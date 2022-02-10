package ua.lviv.iot.work.Domain;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "company")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "phone_number", length = 12, nullable = false)
    private String phone_number;

    @Column(name = "CEO", length = 45, nullable = false)
    private String CEO;

    @Column(name = "number_of_employees")
    private Integer number_of_employees;

    @Column(name = "since_date")
    private Date since_date;

    @Override
    public String toString() {
        return "\nId: " + id + ", name: " + name + ", phone_number: " + phone_number+
                ",CEO:"+CEO+", number_of_employees"+ number_of_employees +",since_date"+since_date;
    }
}
