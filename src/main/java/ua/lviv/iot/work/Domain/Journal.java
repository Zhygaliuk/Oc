package ua.lviv.iot.work.Domain;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "journal")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "journal_head")
    private String journal_head;

    @ManyToOne
    @JoinColumn(name = "Company_id", referencedColumnName = "id", nullable = false)
    private Company company;

    @Override
    public String toString() {
        return "\nId: " + id + ", name: " + name + ",journal_head" + journal_head;
    }
}