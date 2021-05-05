package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysDao extends JpaRepository<Pays,Integer> {
}
