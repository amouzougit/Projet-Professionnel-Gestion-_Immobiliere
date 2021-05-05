package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Demarcheur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("demarcheurService")
public interface DemarcheurService {


    public List<Demarcheur> getAll();

    public Demarcheur getById(Integer id);

    public Demarcheur save(Demarcheur demarcheur);

    public List<Demarcheur> saveAll(List<Demarcheur> demarcheurs);

    public void delete(Demarcheur demarcheur);

    public void deleteAll();


}
