package ad.ya.jpainit.entities.basic.relationship.otm;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("otm")
public class OTM_Controller extends GenericController<OTM,String, OTM_Service> {

    public OTM_Controller(OTM_Service service) {
        super(service);
    }
}
