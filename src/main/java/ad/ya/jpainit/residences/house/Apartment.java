package ad.ya.jpainit.residences.house;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Apartment extends House {
    @ElementCollection
    private List<Integer> piecesSurface;
}
