package ad.ya.jpainit.entities.basic.generic;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class GenericService<
        E,
        I,
        R extends JpaRepository<E,I>
        > implements I_GenericService<E,I>{

    private final R repo;

    @Override
    public List<E> all() {
        return repo.findAll();
    }

    @Override
    public Optional<E> byId(I id) {
        return repo.findById(id);
    }

    @Override
    public void deleteById(I id) {
        repo.deleteById(id);
    }

    @Override
    public E saveOrUpdate(E entity) {
        return repo.saveAndFlush(entity);
    }
}
