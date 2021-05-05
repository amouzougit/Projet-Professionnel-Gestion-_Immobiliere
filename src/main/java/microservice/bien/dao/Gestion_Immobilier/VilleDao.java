package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleDao extends JpaRepository<Ville, Integer> {
}
