package ad.ya.jpainit.entities.heritage.single_table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // @Inheritance est la pour indiquer à l'ORM comment mapper un héritage JAVA
// Puisque les champs non utiles à l'objet créé sont définies à null en BDD, il ne sera pas possible d'utiliser "nullable = false" dans les classes enfant
@DiscriminatorColumn(name = "discriminator") // permet de personnaliser la colonne dtype
@DiscriminatorValue("Foo") // Personnalise la valeur à insérer dans la colonne dtype
public class ST_Foo {
    @Id // Clé Primaire (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Utilise l'auto-increment pour la clé primaire
    private long id;
    private String name = "ST_Foo";
}
