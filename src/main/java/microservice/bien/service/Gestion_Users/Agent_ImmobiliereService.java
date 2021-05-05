package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.AgenceImmobiliere;
import microservice.bien.model.Gestion_Users.Agent_Immobiliere;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("agent_immobiliereService")
public interface Agent_ImmobiliereService {

    public List<Agent_Immobiliere> getAll();

    public Agent_Immobiliere getById(Integer id);

    public Agent_Immobiliere save(Agent_Immobiliere agent_immobiliere);

    public List<Agent_Immobiliere> saveAll(List<Agent_Immobiliere> agent_immobilieres);

    public void delete(Agent_Immobiliere agent_immobiliere);

    public void deleteAll();


}
