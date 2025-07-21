package ad.ya.jpainit.entities.basic.relationship;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable // Indique que les champs de cette classe peuvent être inclus dans une autre table
public class B_Bar {
    private String barName;
    private String barMan;
}
