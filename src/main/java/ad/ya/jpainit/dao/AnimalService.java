package ad.ya.jpainit.dao;

import ad.ya.jpainit.entities.basic.generic.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class AnimalService extends GenericService<Animal,Long, AnimalRepository> {
    public AnimalService(AnimalRepository repo) {
        super(repo);
    }

    List<Animal> findByNameContaining(String name) {
        return repo.findByNameContaining(name);
    }

    List<Animal> findByBirthday(LocalDate date) {
        return repo.findByBirthday(date);

    }

    List<Animal> findByChildren_Name(String name) {
        return repo.findByChildren_Name(name);

    }

    List<Animal> findByChildren_Id(Long id) {
        return repo.findByChildren_Id(id);

    }

    Page<Animal> search(Animal filter, Pageable pageable) {
        return repo.search(filter.getId(), filter.getName(), filter.getBirthday(), pageable);
    }
}
