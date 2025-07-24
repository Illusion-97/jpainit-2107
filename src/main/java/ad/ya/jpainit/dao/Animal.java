package ad.ya.jpainit.dao;

import ad.ya.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Animal extends BaseEntity {
    private String name;
    @Temporal(TemporalType.DATE)
    private LocalDate birthday;
    @ManyToMany
    private Set<Animal> children;
}
