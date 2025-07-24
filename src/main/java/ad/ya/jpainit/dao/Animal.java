package ad.ya.jpainit.dao;

import ad.ya.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NamedQuery(name = "Animal.named", query = "FROM Animal a WHERE a.name = 'REX'")
public class Animal extends BaseEntity {
    private String name;
    @Temporal(TemporalType.DATE)
    private LocalDate birthday;
    @ManyToMany
    private Set<Animal> children;
}
