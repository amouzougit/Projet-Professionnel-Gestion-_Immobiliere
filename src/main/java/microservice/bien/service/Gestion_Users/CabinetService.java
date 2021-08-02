package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Cabinet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cabinetService")
public interface CabinetService {

    public List<Cabinet> getAll();

    public Cabinet getById(Integer id);

    public Cabinet save(Cabinet cabinet);

    public List<Cabinet> saveAll(List<Cabinet> cabinets);

    public void delete(Cabinet cabinet);

    public void deleteAll();
    
     


}
