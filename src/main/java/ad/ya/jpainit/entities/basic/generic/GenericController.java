package ad.ya.jpainit.entities.basic.generic;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
public class GenericController<
        E,
        I,
        S extends I_GenericService<E,I>> {
    protected final S service;


    @GetMapping
    public Page<E> all(Pageable pageable) {
        return service.all(pageable);
    }

    @GetMapping("{id}")
    public Optional<E> byId(@PathVariable I id) {
        return service.byId(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable I id) {
        service.deleteById(id);
    }


    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public E saveOrUpdate(@RequestBody E foo) {
        return service.saveOrUpdate(foo);
    }
}
