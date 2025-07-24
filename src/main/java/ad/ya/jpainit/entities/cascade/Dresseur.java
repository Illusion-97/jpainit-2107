package ad.ya.jpainit.entities.cascade;

import ad.ya.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.*;
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
    // PERSIST : Créer un nouvel enregistrement pour l'entité liée, quand une entité principale est créée
    @OneToOne(cascade = CascadeType.PERSIST)
    private Chien chien;
    // Merge : Permet la mise à jour simultanée de l'entité principale et de celle associée
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private List<Chat> chats;
    // REMOVE : Supprime les entités associées en même temps que la principale
    /* Points d'attention :
    * très peu recommandé sur des relations ***ToMany
    * problématique surtout dans le cadre du ManyToMany
    * pour les cas particuliers privilégier orphanRemoval (attention, n'est pas disponibles sur tout type de relations)
    * */
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) // Remove à éviter

    /* REFRESH & DETACH peu utiles pour JPA (géré automatiquement)
    * DETACH supprimme la sychronisation Programme/BDD pour l'entité, REFRESH la rétablit
    * La cascade de ces éléments transmet ces actions aux entités associées
    * */

    // CascadeType.ALL allias -> {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH} à éviter le plus possible
    private List<Outil> outils;

}
