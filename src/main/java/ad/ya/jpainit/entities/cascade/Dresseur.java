package ad.ya.jpainit.entities.cascade;

import ad.ya.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Dresseur extends BaseEntity {
    private String nom;
    private String prenom;
    private Chien chien;
    private List<Chat> chats;
    private List<Outil> outils;

}
