package ad.ya.jpainit.entities.basic;

import ad.ya.jpainit.entities.basic.generic.GenericController;
import ad.ya.jpainit.entities.basic.relationship.oto.OTO;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("{b_foo}/addOTO/{OTOId}")
    public Optional<B_Foo> addOTO(@PathVariable Long b_foo, @PathVariable String OTOId ) {
        // Spring Data JPA n'a besoin que de l'id de l'entité associée pour créer la relation
        /*
        Optional<B_Foo> opt = byId(b_foo); // récupérer le B_Foo auquel on souhaite associer un OTO
        opt.ifPresent( // N'est exécuté que si le B_foo est trouvé
                bFoo -> { // La variable déclarée dans cette lambda est l'objet B_Foo effectivement récupéré
                    OTO oto = new OTO().setId(OTOId); // L'ID est le seul élément nécessaire à l'association
                    bFoo.setOneToOne(oto); // on affecte la variable
                    saveOrUpdate(bFoo); // Persister les changements en BDD
                }
        ); // .ifPresent ne renvoie rien, si on veut obtenir un retour (la valeur après save) on utilise .map
        byId(b_foo).ifPresent(bFoo -> saveOrUpdate(bFoo.setOneToOne(new OTO().setId(OTOId))));
        */

        return byId(b_foo).map(bFoo -> saveOrUpdate(bFoo.setOneToOne(new OTO().setId(OTOId))));
    }
}
