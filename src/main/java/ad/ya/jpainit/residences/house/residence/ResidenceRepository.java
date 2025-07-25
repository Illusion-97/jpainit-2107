package ad.ya.jpainit.residences.house.residence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidenceRepository extends JpaRepository<Residence, ResidenceId> {
  }