package ad.ya.jpainit.entities.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class B_Foo_Service {
    private final B_Foo_Repository repo;

    public List<B_Foo> all() {
        return repo.findAll();
    }
}
