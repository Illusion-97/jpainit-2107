package ad.ya.jpainit.entities.basic;

import ad.ya.jpainit.entities.basic.relationship.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

// Java Bean <-> Plain Old Java Object
// Java Bean : est une classe Serializable, avec des attributs privés, des accesseurs, et au moins le constructeur vide
@Getter
@Setter
@Accessors(chain = true) // utilise les Setters type "builder"
// ORM : Object Relationning Manager -> Hibernate
@Entity // Initier le mapping relationnel : Considère cette classe comme une entité à persister en BDD
@Table(name = "basic_foo") // Personnalisation des règles de création de la table
public class B_Foo implements Serializable {
    @Id // Clé Primaire (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Utilise l'auto-increment pour la clé primaire
    private long id;
    // JPA possède des standards associés aux types
    // La précision du "dialecte" (actuellement géré automatiquement) permet a spring de savoir quel standard utiliser
    @Column(
            name = "string_value",
            nullable = false, // Refuse les valeurs nulles
            unique = true, // Interdit les doublons sur ce champ
            updatable = false, // Interdit la mise ajour de la valeur après sa création
            length = 50, // Limite la taille du champ
            columnDefinition = "TEXT" // Change le type associé à la colonne (TEXT pratique pour les longues "descriptions")
    )
    private String str;
    @Column(
            name = "int_value",
            nullable = false,
            length = 6
    )
    private int anInt;

    @Column(
            columnDefinition = "DECIMAL(10,2)"
    )
    private double price;

    @Column(
            precision = 5, // nombre de digit avant de scale
            scale = 2 // unscaledValue x 10exp - scale
    )
    private BigDecimal percent; // 12345 x 10^-2 = 12345 / 100 = 123.45

    @Column(columnDefinition = "BIT(1)")
    private boolean aBoolean;

    @Temporal(TemporalType.DATE)
    private LocalDate date;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime moment;

    @Temporal(TemporalType.TIME)
    private LocalTime time;

    //Défaut : EnumType.ORDINAL (position de la valeur dans l'enum)
    @Enumerated(EnumType.STRING)
    private Enumeration enumeration;

    /*
    * One To Many
    * Many to Many
    * One To One
    * Many To One
    *
    * Chacune de ses relation peut être bi-directionnelle ou non
    * */
    // ***ToOne -> Par une colonne dans la table : fait référence à un enregistrement unique
    // Ces annotations portent sur un Objet "unique"
    @OneToOne
    private OTO oneToOne;
    @ManyToOne
    private MTO manyToOne;

    // ***ToMany -> Par une table d'association : possibilité de référencer plusieurs enregistrements
    // Elles portent toujours sur des Collections
    @OneToMany
    private Set<OTM> oneToMany;
    @ManyToMany
    private List<MTM> manyToMany;

    @ManyToMany
    private List<MTMBD> manyToManyBD;

    @ElementCollection // Permet la création d'une table d'association pour les types "basiques"
    private List<String> strs;

    @Embedded // Récupère une structure à inclure dans celle de cette table
    private B_Bar bar;

    @Override
    public String toString() {
        return "B_Foo{" +
                "id=" + id +
                ", str='" + str + '\'' +
                ", anInt=" + anInt +
                ", price=" + price +
                ", percent=" + percent +
                ", aBoolean=" + aBoolean +
                '}';
    }
}
