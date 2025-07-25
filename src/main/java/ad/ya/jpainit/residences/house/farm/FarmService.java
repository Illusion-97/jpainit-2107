package ad.ya.jpainit.residences.house.farm;

import ad.ya.jpainit.entities.basic.generic.GenericService;
import ad.ya.jpainit.residences.house.Address;
import org.springframework.stereotype.Service;


@Service
public class FarmService extends GenericService<Farm, Address, FarmRepository> {

    public FarmService(FarmRepository repo) {
        super(repo);
    }
}
