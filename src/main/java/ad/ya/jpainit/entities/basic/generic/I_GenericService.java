package ad.ya.jpainit.entities.basic.generic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface I_GenericService<E,I> {
    Page<E> all(Pageable pageable);

    Optional<E> byId(I id);

    void deleteById(I id);

    E saveOrUpdate(E entity);
}
