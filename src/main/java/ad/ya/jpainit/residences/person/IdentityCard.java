package ad.ya.jpainit.residences.person;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class IdentityCard extends IdForm {
    private String puceId;
}
