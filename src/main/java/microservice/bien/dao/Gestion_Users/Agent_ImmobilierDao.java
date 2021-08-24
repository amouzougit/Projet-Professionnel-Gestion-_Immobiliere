package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Agent_Immobilier;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("agent_immobilierDao")
public interface Agent_ImmobilierDao extends JpaRepository<Agent_Immobilier,Integer> {
	
	

	



}
