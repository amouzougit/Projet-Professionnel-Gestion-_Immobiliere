package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Plainte;
import microservice.bien.model.Gestion_Users.Proprietaire;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("proprietaireService")
public interface ProprietaireService {

    public List<Proprietaire> getAll();

    public Proprietaire getById(Integer id);

    public Proprietaire save(Proprietaire proprietaire);

    public List<Proprietaire> saveAll(List<Proprietaire> proprietaires);

    public void delete(Proprietaire proprietaire);

    public void deleteAll();

}
