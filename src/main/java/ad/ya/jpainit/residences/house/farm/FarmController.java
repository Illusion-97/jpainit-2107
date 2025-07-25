package ad.ya.jpainit.residences.house.farm;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import ad.ya.jpainit.residences.house.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("farm")
public class FarmController extends GenericController<Farm, Address, FarmService> {

    public FarmController(FarmService service) {
        super(service);
    }
}
