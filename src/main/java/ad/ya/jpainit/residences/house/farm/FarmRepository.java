package ad.ya.jpainit.residences.house.farm;

import ad.ya.jpainit.residences.house.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmRepository extends JpaRepository<Farm, Address> {
}
