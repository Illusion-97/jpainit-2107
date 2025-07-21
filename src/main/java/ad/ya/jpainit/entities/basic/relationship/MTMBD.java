package ad.ya.jpainit.entities.basic.relationship;

import ad.ya.jpainit.entities.basic.B_Foo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class MTMBD implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToMany(mappedBy = "manyToManyBD")
    private List<B_Foo> FOO;
}
