package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.AgenceImmobiliere;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("agenceImmobiliereService")
public interface AgenceImmobiliereService {

    public List<AgenceImmobiliere> getAll();

    public AgenceImmobiliere getById(Integer id);

    public AgenceImmobiliere save(AgenceImmobiliere agenceImmobiliere);

    public List<AgenceImmobiliere> saveAll(List<AgenceImmobiliere> agenceImmobilieres);

    public void delete(AgenceImmobiliere agenceImmobiliere);

    public void deleteAll();




}
