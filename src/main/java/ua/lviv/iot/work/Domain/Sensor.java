package ua.lviv.iot.work.Domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "sensor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "sensor_type")
    private  String sensor_type;

    @Column(name = "wireless")
    private Integer wireless;

    @Column(name = "power_supply", length = 45, nullable = false)
    private String power_supply;

    @ManyToOne
    @JoinColumn(name = "control_zone_id", referencedColumnName = "id", nullable = false)
    private ControlZone controlZone;

    @ManyToOne
    @JoinColumn(name = "signal_system_id", referencedColumnName = "id", nullable = false)
    private SignalSystem signalSystem;

    @Override
    public String toString() {
        return "\nId: " + id + ", sensor_type: " + sensor_type + ", wireless: " + wireless
                + ",power_supply: " + power_supply;
    }
}
