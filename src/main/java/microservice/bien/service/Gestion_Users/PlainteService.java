package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Personne;
import microservice.bien.model.Gestion_Users.Plainte;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("plainteService")
public interface PlainteService {

    public List<Plainte> getAll();

    public Plainte getById(Integer id);

    public Plainte save(Plainte plainte);

    public List<Plainte> saveAll(List<Plainte> plaintes);

    public void delete(Plainte plainte);

    public void deleteAll();




}
