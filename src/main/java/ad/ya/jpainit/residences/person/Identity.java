package ad.ya.jpainit.residences.person;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.Set;

@Embeddable
@Getter
@Setter
@Accessors(chain = true)
public class Identity {
    @OneToMany
    private Set<IdForm> idForms;

    // Aurait pu être placé dans la classe Personne sans différence au niveau du diagramme
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private LocalDateTime birthDate;
}
