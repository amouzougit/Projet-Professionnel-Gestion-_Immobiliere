package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Bien;
import microservice.bien.model.Gestion_Immobilier.Quartier;
import microservice.bien.model.Gestion_Users.AgenceImmobiliere;
import microservice.bien.model.Gestion_Users.Agent_Immobilier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bienDao")
public interface BienDao extends JpaRepository <Bien, Long>{
	
	
	public List<Bien> findByAgentImmobilier(Agent_Immobilier agenceImmobilier);
	
	public Integer countByAgentImmobilier(Agent_Immobilier agentImmobilier);


	
	


}
