package ad.ya.jpainit.entities.basic.relationship.otm;

import ad.ya.jpainit.entities.basic.generic.GenericService;
import org.springframework.stereotype.Service;


@Service
public class OTM_Service extends GenericService<OTM, String, OTM_Repository> {

    public OTM_Service(OTM_Repository repo) {
        super(repo);
    }
}
