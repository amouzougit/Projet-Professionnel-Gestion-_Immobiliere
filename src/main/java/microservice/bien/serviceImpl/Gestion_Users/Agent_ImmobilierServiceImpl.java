package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.Agent_ImmobilierDao;
import microservice.bien.model.Gestion_Users.Agent_Immobilier;
import microservice.bien.service.Gestion_Users.Agent_ImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("agent_immobilierService")
public class Agent_ImmobilierServiceImpl implements Agent_ImmobilierService {
    @Autowired
    //@Qualifier(value = "agent_immobilierDao")
    private Agent_ImmobilierDao agent_immobilierDao;


    @Override
    public List<Agent_Immobilier> getAll() {
        return this.agent_immobilierDao.findAll();
    }

    @Override
    public Agent_Immobilier getById(Long id) {
        return this.agent_immobilierDao.getOne(id);
    }

    @Override
    public Agent_Immobilier save(Agent_Immobilier agent_immobilier) {
        return this.agent_immobilierDao.save(agent_immobilier);
    }

    @Override
    public List<Agent_Immobilier> saveAll(List<Agent_Immobilier> agent_immobiliers) {
        return this.agent_immobilierDao.saveAll(agent_immobiliers);
    }

    @Override
    public void delete(Agent_Immobilier agent_immobilier) {
        this.agent_immobilierDao.delete(agent_immobilier);

    }

    @Override
    public void deleteAll() {
        this.agent_immobilierDao.deleteAll();

    }
}
