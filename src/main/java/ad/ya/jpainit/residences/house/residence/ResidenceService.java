package ad.ya.jpainit.residences.house.residence;

import ad.ya.jpainit.entities.basic.generic.GenericService;
import org.springframework.stereotype.Service;


@Service
public class ResidenceService extends GenericService<Residence, ResidenceId, ResidenceRepository> {

    public ResidenceService(ResidenceRepository repo) {
        super(repo);
    }
}
