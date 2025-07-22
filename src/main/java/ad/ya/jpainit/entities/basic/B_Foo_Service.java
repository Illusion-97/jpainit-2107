package ad.ya.jpainit.entities.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class B_Foo_Service {
    private final B_Foo_Repository repo;

    public List<B_Foo> all() {
        return repo.findAll();
    }

    /*public B_Foo byId(Long id) {
        Optional<B_Foo> byId = repo.findById(id);
        *//*if(byId.isPresent()) return byId.get();
        else return null;*//*

//        return byId.isPresent() ? byId.get() : null;

        return byId.orElse(null);
    }*/

    public Optional<B_Foo> byId(Long id) {
        return repo.findById(id);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
