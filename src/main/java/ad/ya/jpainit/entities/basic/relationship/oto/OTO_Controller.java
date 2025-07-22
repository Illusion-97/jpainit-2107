package ad.ya.jpainit.entities.basic.relationship.oto;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("oto")
public class OTO_Controller extends GenericController<OTO,String,OTO_Service> {

    public OTO_Controller(OTO_Service service) {
        super(service);
    }
}
