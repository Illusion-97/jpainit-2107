package ad.ya.jpainit.entities.heritage.table_per_class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TPC_BarA extends TPC_Foo {
    private String valA = "TPC_Bar_A";
}
