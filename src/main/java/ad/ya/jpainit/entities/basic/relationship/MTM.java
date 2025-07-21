package ad.ya.jpainit.entities.basic.relationship;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class MTM implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
