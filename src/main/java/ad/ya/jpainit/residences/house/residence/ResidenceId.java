package ad.ya.jpainit.residences.house.residence;

import ad.ya.jpainit.residences.house.House;
import ad.ya.jpainit.residences.person.personne.Personne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResidenceId {
    private House house;
    private Personne resident;
}
