package ad.ya.jpainit.residences.person.personne;

import ad.ya.jpainit.residences.house.residence.Residence;
import ad.ya.jpainit.residences.person.Identity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Set;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Embedded
    private Identity identity;

    @OneToMany(mappedBy = "resident")
    private Set<Residence> residences;
}
