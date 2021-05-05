package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Agent_Immobiliere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Agent_ImmobiliereDao extends JpaRepository<Agent_Immobiliere,Integer> {
}
