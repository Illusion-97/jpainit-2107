package ad.ya.jpainit.entities.heritage.joining;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class J_Foo {
    @Id // Clé Primaire (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Utilise l'auto-increment pour la clé primaire
    private long id;
    private String name = "J_Foo";
}
