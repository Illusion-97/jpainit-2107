package ad.ya.jpainit.entities.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

@RestController
@RequiredArgsConstructor
@RequestMapping("b_foo")
public class B_Foo_Controller {
    private final B_Foo_Service service;


    @GetMapping
    public List<B_Foo> all() {
        return service.all();
    }

    /*@GetMapping({"{id}", "/"})
    public Optional<B_Foo> byId(@PathVariable Optional<Long> id) {
        return service.byId(id.orElse(0L));
    }*/

    @GetMapping("{id}")
    public Optional<B_Foo> byId(@PathVariable Long id) {
        return service.byId(id);
    }
}
