package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Agent_Immobiliere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("agent_immobiliereDao")
public interface Agent_ImmobiliereDao extends JpaRepository<Agent_Immobiliere,Integer> {
}
