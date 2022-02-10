package ua.lviv.iot.work.Domain;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "control_zone")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ControlZone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "zone_type", length = 45, nullable = false)
    private String zone_type;

    @Column(name = "area")
    private Integer area;

    @ManyToOne
    @JoinColumn(name = "campus_id", referencedColumnName = "id", nullable = false)
    private Campus campus;

    @Override
    public String toString() {
        return "\nId: " + id + ", name: " + name + ",zone_type"
                +zone_type+",area"+area+",Campus_id"+campus;
    }
}