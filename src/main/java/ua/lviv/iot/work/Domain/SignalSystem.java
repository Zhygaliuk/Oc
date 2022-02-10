package ua.lviv.iot.work.Domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "signal_system")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString

public class SignalSystem {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;

    @Column(name = "system_type", length = 45, nullable = false)
    private String system_type;

    @ManyToOne
    @JoinColumn(name = "Signal_system_manufacturer_id", referencedColumnName = "id", nullable = false)
    private SignalSystemManufacturer signal_system_manufacturer_id;

    @Override
    public String toString() {
        return "\nId:" + id + ", system_type: " + system_type;
    }
}