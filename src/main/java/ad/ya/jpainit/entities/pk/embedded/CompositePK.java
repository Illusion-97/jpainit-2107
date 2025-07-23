package ad.ya.jpainit.entities.pk.embedded;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
@Embeddable
public class CompositePK implements Serializable { // Serializable nécessaire pour une clé primaire
    private String data;
    private Integer number;
    private Boolean status;
}
