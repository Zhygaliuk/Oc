package ua.lviv.iot.work.Domain;




import lombok.*;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Table(name = "campus")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class    Campus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "adress", length = 45, nullable = false)
    private String adress;

    @ManyToOne
    @JoinColumn(name = "Company_id", referencedColumnName = "id", nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "Signal_system_id", referencedColumnName = "id", nullable = false)
    private SignalSystem signalSystem;

    @Override
    public String toString() {
        return "\nId: " + id + ", name: " + name + ", address: " + adress;
    }
}

