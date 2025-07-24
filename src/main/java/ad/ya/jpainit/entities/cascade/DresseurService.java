package ad.ya.jpainit.entities.cascade;

import ad.ya.jpainit.entities.basic.generic.GenericService;
import org.springframework.stereotype.Service;


@Service
public class DresseurService extends GenericService<Dresseur,Long, DresseurRepository> {
    public DresseurService(DresseurRepository repo) {
        super(repo);
    }

}
