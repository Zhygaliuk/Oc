package ua.lviv.iot.work.Domain;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "patrol")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Patrol {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

        @Column(name = "operators_number")
        private  Integer operators_number;

        @Column(name = "head_id")
        private Integer head_id;

        @Column(name = "name", length = 45, nullable = false)
        private String name;


        @Override
        public String toString() {
                return "\n\nAddress: id: " + id + ", name: " + name + ", operators_number: " + operators_number
                        + ",head_id:" + head_id;
        }
}
