package ad.ya.jpainit.entities.basic;

import ad.ya.jpainit.entities.basic.generic.GenericService;
import org.springframework.stereotype.Service;


@Service
public class B_Foo_Service extends GenericService<B_Foo,Long,B_Foo_Repository> {
    public B_Foo_Service(B_Foo_Repository repo) {
        super(repo);
    }

    /*public B_Foo byId(Long id) {
        Optional<B_Foo> byId = repo.findById(id);
        *//*if(byId.isPresent()) return byId.get();
        else return null;*//*

//        return byId.isPresent() ? byId.get() : null;

        return byId.orElse(null);
    }*/

}
