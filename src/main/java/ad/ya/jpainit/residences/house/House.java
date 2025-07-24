package ad.ya.jpainit.residences.house;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

// La table House n'est ps générée en BDD puisqu'elle est abstraite
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@Accessors(chain = true)
public abstract class House {
    @EmbeddedId // Embarque une classe et la considère en plus comme clé primaire
    private Address address;
}
