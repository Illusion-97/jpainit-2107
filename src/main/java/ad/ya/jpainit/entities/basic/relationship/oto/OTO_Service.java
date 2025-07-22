package ad.ya.jpainit.entities.basic.relationship.oto;

import ad.ya.jpainit.entities.basic.generic.GenericService;
import org.springframework.stereotype.Service;


@Service
public class OTO_Service extends GenericService<OTO, String, OTO_Repository> {

    public OTO_Service(OTO_Repository repo) {
        super(repo);
    }
}
