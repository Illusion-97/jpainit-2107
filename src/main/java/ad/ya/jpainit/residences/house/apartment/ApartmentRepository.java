package ad.ya.jpainit.residences.house.apartment;

import ad.ya.jpainit.residences.house.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Address> {
}
