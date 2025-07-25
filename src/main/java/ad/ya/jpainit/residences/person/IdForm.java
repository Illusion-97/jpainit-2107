package ad.ya.jpainit.residences.person;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Table(name = "identification")
public abstract class IdForm {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @Temporal(TemporalType.DATE)
    private LocalDate issuedAt;
}
