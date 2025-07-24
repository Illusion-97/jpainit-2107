package ad.ya.jpainit.entities.lifecycle;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("alive")
public class AliveController extends GenericController<Alive,Long, AliveService> {
    public AliveController(AliveService service) {
        super(service);
    }
}
