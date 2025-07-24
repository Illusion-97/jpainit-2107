package ad.ya.jpainit.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Query("""
FROM Animal a
WHERE (:id IS NULL OR a.id = :id)
AND (:name IS NULL OR a.name LIKE %:name%)
AND (:birthday IS NULL OR a.birthday = :birthday)
""")
    Page<Animal> search(Long id, String name, LocalDate birthday, Pageable pageable);
}
