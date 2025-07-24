package ad.ya.jpainit.entities.lifecycle;

import ad.ya.jpainit.entities.basic.generic.GenericService;
import org.springframework.stereotype.Service;


@Service
public class AliveService extends GenericService<Alive,Long, AliveRepository> {
    public AliveService(AliveRepository repo) {
        super(repo);
    }

}
