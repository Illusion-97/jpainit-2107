package ad.ya.jpainit.residences.person.passport;


import ad.ya.jpainit.residences.person.IdForm;
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
public class Passport extends IdForm {
    @ElementCollection
    private List<String> travels;
}
