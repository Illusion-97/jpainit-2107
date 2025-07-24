package ad.ya.jpainit.residences.house;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Embeddable
public class Address {
    private int cp;
    private String line1;
    private String line2;
}
