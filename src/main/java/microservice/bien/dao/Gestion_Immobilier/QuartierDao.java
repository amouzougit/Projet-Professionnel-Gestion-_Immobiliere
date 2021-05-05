package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Quartier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuartierDao extends JpaRepository<Quartier,Integer> {
}
