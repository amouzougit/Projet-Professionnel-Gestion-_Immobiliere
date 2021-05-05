package microservice.bien.service.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Quartier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("quartierService")
public interface QuartierService {


    public List<Quartier> getAll();

    public Quartier getById(Integer id);

    public Quartier save(Quartier quartier);

    public List<Quartier> saveAll(List<Quartier> quartiers);

    public void delete(Quartier quartier);

    public void deleteAll();


}
