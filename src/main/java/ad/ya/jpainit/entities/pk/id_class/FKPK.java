package ad.ya.jpainit.entities.pk.id_class;

import ad.ya.jpainit.entities.basic.relationship.otm.OTM;
import ad.ya.jpainit.entities.basic.relationship.oto.OTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FKPK implements Serializable {
    private OTO oto;
    private OTM otm;
}
