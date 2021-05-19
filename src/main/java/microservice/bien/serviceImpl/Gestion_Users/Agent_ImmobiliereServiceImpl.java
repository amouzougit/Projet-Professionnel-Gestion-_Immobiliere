package microservice.bien.serviceImpl.Gestion_Users;
import microservice.bien.dao.Gestion_Users.Agent_ImmobiliereDao;
import microservice.bien.model.Gestion_Users.Agent_Immobiliere;
import microservice.bien.service.Gestion_Users.Agent_ImmobiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("agent_immobiliereService")
public class Agent_ImmobiliereServiceImpl implements Agent_ImmobiliereService {

    @Autowired
    //@Qualifier(value ="agent_immobiliereDao")
    private Agent_ImmobiliereDao agent_immobiliereDao;

    @Override
    public List<Agent_Immobiliere> getAll() {
        return this.agent_immobiliereDao.findAll();
    }

    @Override
    public Agent_Immobiliere getById(Integer id) {
        return this.agent_immobiliereDao.getOne(id);
    }

    @Override
    public Agent_Immobiliere save(Agent_Immobiliere agent_immobiliere) {
        return this.agent_immobiliereDao.save(agent_immobiliere);
    }

    @Override
    public List<Agent_Immobiliere> saveAll(List<Agent_Immobiliere> agent_immobilieres) {
        return this.agent_immobiliereDao.saveAll(agent_immobilieres);
    }

    @Override
    public void delete(Agent_Immobiliere agent_immobiliere) {
        this.agent_immobiliereDao.delete(agent_immobiliere);

    }

    @Override
    public void deleteAll() {
        this.agent_immobiliereDao.deleteAll();

    }
}
