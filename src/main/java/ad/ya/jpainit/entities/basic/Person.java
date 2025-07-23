package ad.ya.jpainit.entities.basic;

import ad.ya.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Person extends BaseEntity {
    private String name;

    @ManyToMany
    private List<Person> parents;

    @ManyToMany(mappedBy = "parents")
    private List<Person> enfants;

    @ManyToMany
    private List<Person> amis;
    @ManyToMany
    private List<Person> employeurs;

    @ElementCollection
    private List<String> adresses;
}
