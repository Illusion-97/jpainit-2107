package ad.ya.jpainit.entities.heritage.table_per_class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TPC_BarB extends TPC_Foo {
    private String valB = "TPC_Bar_B";
}
