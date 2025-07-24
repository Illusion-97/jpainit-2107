package ad.ya.jpainit.residences.house;

import ad.ya.jpainit.residences.person.Personne;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Residence {
    private House house;
    private Personne resident;
}
