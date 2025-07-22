package ad.ya.jpainit.entities.basic.generic;

import java.util.List;
import java.util.Optional;

public interface I_GenericService<E,I> {
    List<E> all();

    Optional<E> byId(I id);

    void deleteById(I id);

    E saveOrUpdate(E entity);
}
