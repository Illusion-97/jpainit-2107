package ad.ya.jpainit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByNameContaining(String name);
    @Query(value = """
FROM Animal a
WHERE a.birthday = :date
""") // Possibilité d'écrire soi-même la requête dans @Query en utilisant la syntaxe JPQL
    List<Animal> findByBirthday(LocalDate date); // Ou respecter le formalisme de nommage pour qu'elle soit déduite automatiquement

    List<Animal> findByChildren_Name(String name);
    List<Animal> findByChildren_Id(Long id);
}
