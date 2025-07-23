package ad.ya.jpainit.entities.heritage.joining;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class J_BarA extends J_Foo{
    private String valA = "J_Bar_A";
}
