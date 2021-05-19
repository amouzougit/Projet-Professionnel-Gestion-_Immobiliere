package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Agent_Immobilier;
import microservice.bien.model.Gestion_Users.Cabinet;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("agent_immobilierService")
public interface Agent_ImmobilierService {

    public List<Agent_Immobilier> getAll();

    public Agent_Immobilier getById(Integer id);

    public Agent_Immobilier save(Agent_Immobilier agent_immobilier);

    public List<Agent_Immobilier> saveAll(List<Agent_Immobilier> agent_immobiliers);

    public void delete(Agent_Immobilier agent_immobilier);

    public void deleteAll();



}
