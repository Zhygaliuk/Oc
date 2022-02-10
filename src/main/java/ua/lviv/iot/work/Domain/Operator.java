package ua.lviv.iot.work.Domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "operator")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "surname", length = 45, nullable = false)
    private String surname;

    @Column(name = "phone_number", length = 12, nullable = false)
    private String phone_number;

    @Column(name = "CT_number", length = 45, nullable = false)
    private String CT_number;

    @Column(name = "patrol_head")
    private Integer patrol_head;

    @ManyToOne
    @JoinColumn(name = "Signal_system_id", referencedColumnName = "id", nullable = false)
    private SignalSystem signalSystem;

    @Override
    public String toString() {
        return "\n\nAddress: id: " + id + ", name: " + name + ", surname: " + surname + ",phone_number" + phone_number
                + ",CT_number"+CT_number;
    }
}