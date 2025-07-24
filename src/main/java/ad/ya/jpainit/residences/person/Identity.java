package ad.ya.jpainit.residences.person;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Set;

@Embeddable
@Getter
@Setter
@Accessors(chain = true)
public class Identity {
    private Set<IdForm> idForms;
}
