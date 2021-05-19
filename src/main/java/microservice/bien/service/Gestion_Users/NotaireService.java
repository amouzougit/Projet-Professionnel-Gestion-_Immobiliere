package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Notaire;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("notaireService")
public interface NotaireService {

    public List<Notaire> getAll();

    public Notaire getById(Integer id);

    public Notaire save(Notaire notaires);

    public List<Notaire> saveAll(List<Notaire> notaires);

    public void delete(Notaire notaire);

    public void deleteAll();




}
