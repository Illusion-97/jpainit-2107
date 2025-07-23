package ad.ya.jpainit.entities.heritage.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("BarB") // Personnalise la valeur à insérer dans la colonne dtype
public class ST_BarB extends ST_Foo {
    private String valB = "ST_Bar_B";
}
