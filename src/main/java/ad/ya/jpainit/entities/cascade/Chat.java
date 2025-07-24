package ad.ya.jpainit.entities.cascade;

import ad.ya.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Chat extends BaseEntity {
    private boolean gros;
    private boolean ingrat;
    private boolean pickpocket;
}
