package ad.ya.jpainit.entities.heritage.table_per_class;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TPC_Foo {
    @Id
    /*Il n'est pas possible d'utiliser l'auto-increment avec la stratégie d'héritage TABLE_PER_CLASS
    * La valeur étant propre à chaque table, il y aurait décalage dans les PK */
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name = "TPC_Foo";
}
