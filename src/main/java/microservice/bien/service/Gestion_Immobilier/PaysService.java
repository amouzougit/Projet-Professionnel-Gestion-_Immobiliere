package microservice.bien.service.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Pays;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("paysService")
public interface PaysService {

    public List<Pays> getAll();

    public Pays getById(Integer id);

    public Pays save(Pays machine);

    public List<Pays> saveAll(List<Pays> pays);

    public void delete(Pays pays);

    public void deleteAll();

}
