package ad.ya.jpainit.residences.house.residence;

import ad.ya.jpainit.residences.house.House;
import ad.ya.jpainit.residences.person.personne.Personne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@IdClass(ResidenceId.class)
public class Residence {
    @Id
    @ManyToOne
    private House house;

    @Id
    @ManyToOne
    private Personne resident;

    private boolean main;
}
