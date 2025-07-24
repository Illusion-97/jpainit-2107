package ad.ya.jpainit.entities.cascade;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("dresseur")
public class DresseurController extends GenericController<Dresseur,Long, DresseurService> {
    public DresseurController(DresseurService service) {
        super(service);
    }
}
