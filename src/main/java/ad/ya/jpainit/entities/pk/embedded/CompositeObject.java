package ad.ya.jpainit.entities.pk.embedded;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CompositeObject {

    @EmbeddedId
    private CompositePK id;

    private String value;
}
