package ad.ya.jpainit.residences.house;

import ad.ya.jpainit.residences.person.Personne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResidenceId {
    private House house;
    private Personne resident;
}
