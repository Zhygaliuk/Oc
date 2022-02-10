package ua.lviv.iot.work.Domain;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "journal_entry")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class JournalEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "author_name", length = 45, nullable = false)
    private String author_name;

    @Column(name = "description", length = 450, nullable = false)
    private String  description;

    @Column(name = "state", length = 45, nullable = false)
    private String state;

    @Column(name = "date_of_entry")
    private Date date_of_entry;

    @Column(name = "countermeasure", length = 100, nullable = false)
    private String countermeasure;

    @ManyToOne
    @JoinColumn(name = "Journal_id", referencedColumnName = "id", nullable = false)
    private Journal journal;

    @ManyToOne
    @JoinColumn(name = "Campus_id", referencedColumnName = "id", nullable = false)
    private Campus campus;

    @ManyToOne
    @JoinColumn(name = "Operator_id", referencedColumnName = "id", nullable = false)
    private Operator operator;

    @Override
    public String toString() {
        return "\nId: " + id + ", author_name: " + author_name + ", description: " +description+ ",date_of_entry"
                + date_of_entry + ",state" + state + ",countermeasure" + countermeasure;
    }
}