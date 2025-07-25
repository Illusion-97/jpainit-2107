package ad.ya.jpainit.residences.house.farm;

import ad.ya.jpainit.residences.house.House;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Farm extends House {
    private int livestock;
}
