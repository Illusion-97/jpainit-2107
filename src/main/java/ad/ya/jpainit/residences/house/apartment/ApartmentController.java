package ad.ya.jpainit.residences.house.apartment;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import ad.ya.jpainit.residences.house.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apartment")
public class ApartmentController extends GenericController<Apartment, Address, ApartmentService> {

    public ApartmentController(ApartmentService service) {
        super(service);
    }
}
