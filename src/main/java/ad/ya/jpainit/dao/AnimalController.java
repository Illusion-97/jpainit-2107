package ad.ya.jpainit.dao;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("animal")
public class AnimalController extends GenericController<Animal,Long, AnimalService> {
    public AnimalController(AnimalService service) {
        super(service);
    }

    @GetMapping("byName/{name}")
    List<Animal> findByNameContaining(@PathVariable String name) {
        return service.findByNameContaining(name);
    }
    @GetMapping("byBirthday/{date}")
    List<Animal> findByBirthday(@PathVariable LocalDate date) {
        return service.findByBirthday(date);

    }
    @GetMapping("byChildrenName/{name}")
    List<Animal> findByChildren_Name(@PathVariable String name) {
        return service.findByChildren_Name(name);

    }
    @GetMapping("byChildrenId/{id}")
    List<Animal> findByChildren_Id(@PathVariable Long id) {
        return service.findByChildren_Id(id);

    }
}
