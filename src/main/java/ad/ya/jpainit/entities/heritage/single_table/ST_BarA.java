package ad.ya.jpainit.entities.heritage.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("BarA") // Personnalise la valeur à insérer dans la colonne dtype
public class ST_BarA extends ST_Foo {
    private String valA = "ST_Bar_A";
}
