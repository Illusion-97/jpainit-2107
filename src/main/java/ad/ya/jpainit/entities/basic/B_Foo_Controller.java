package ad.ya.jpainit.entities.basic;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("b_foo")
public class B_Foo_Controller extends GenericController<B_Foo,Long,B_Foo_Service> {
    public B_Foo_Controller(B_Foo_Service service) {
        super(service);
    }

    /*@GetMapping({"{id}", "/"})
    public Optional<B_Foo> byId(@PathVariable Optional<Long> id) {
        return service.byId(id.orElse(0L));
    }*/
}
