package ad.ya.jpainit.entities.pk.id_class;

import ad.ya.jpainit.entities.basic.relationship.otm.OTM;
import ad.ya.jpainit.entities.basic.relationship.oto.OTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@IdClass(FKPK.class) // Précise une classe déclarative reprenant les éléments constituant la clé primaire
public class Associate {
    @Id
    @ManyToOne
    private OTO oto;
    @Id
    @ManyToOne
    private OTM otm;

    private LocalDateTime moment;
}
