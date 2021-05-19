package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Notaire_cabinet;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("notaire_cabinetService")
public interface Notaire_cabinetService {


    public List<Notaire_cabinet> getAll();

    public Notaire_cabinet getById(Integer id);

    public Notaire_cabinet save(Notaire_cabinet notaire_cabinet);

    public List<Notaire_cabinet> saveAll(List<Notaire_cabinet> notaire_cabinets);

    public void delete(Notaire_cabinet notaire_cabinet);

    public void deleteAll();

}
