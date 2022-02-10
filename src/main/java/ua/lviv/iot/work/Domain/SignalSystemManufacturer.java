package ua.lviv.iot.work.Domain;




import lombok.*;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Table(name = "signal_system_manufacturer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class SignalSystemManufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "phone", length = 12, nullable = false)
    private String phone;

    @Column(name = "advertisment", length = 90, nullable = false)
    private String advertisment;

    @Override
    public String toString() {
        return "\nId: " + id + ", name: " + name + ", phone: " + phone + ",advertisment:" + advertisment;
    }
}

