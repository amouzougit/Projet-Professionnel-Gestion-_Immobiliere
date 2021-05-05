package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Agent_Immobilier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Agent_ImmobilierDao extends JpaRepository<Agent_Immobilier,Integer> {
}
