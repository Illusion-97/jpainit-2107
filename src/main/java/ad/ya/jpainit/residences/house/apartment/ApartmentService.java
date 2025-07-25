package ad.ya.jpainit.residences.house.apartment;

import ad.ya.jpainit.entities.basic.generic.GenericService;
import ad.ya.jpainit.residences.house.Address;
import org.springframework.stereotype.Service;


@Service
public class ApartmentService extends GenericService<Apartment, Address, ApartmentRepository> {

    public ApartmentService(ApartmentRepository repo) {
        super(repo);
    }
}
