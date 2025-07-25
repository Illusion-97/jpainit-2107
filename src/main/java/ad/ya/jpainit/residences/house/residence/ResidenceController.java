package ad.ya.jpainit.residences.house.residence;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import ad.ya.jpainit.residences.house.Address;
import ad.ya.jpainit.residences.house.apartment.Apartment;
import ad.ya.jpainit.residences.person.personne.Personne;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("residence")
public class ResidenceController extends GenericController<Residence, ResidenceId, ResidenceService> {

    public ResidenceController(ResidenceService service) {
        super(service);
    }

    @PostMapping("apartment/{personId}")
    public Residence saveApartment(@PathVariable long personId, @RequestBody Address address) {
        return service.saveOrUpdate(
                new Residence()
                        .setResident(
                                new Personne().setId(personId)
                        )
                        .setHouse(
                                new Apartment()
                                        .setAddress(address)
                        )
                );
    }

}
