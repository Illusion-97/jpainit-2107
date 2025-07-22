package ad.ya.jpainit.entities.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("b_foo")
public class B_Foo_Controller {
    private final B_Foo_Service service;


    @GetMapping
    public List<B_Foo> all() {
        return service.all();
    }
}
