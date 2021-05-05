package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Administrateur;
import microservice.bien.model.Gestion_publication.Publication;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("administrateurService")
public interface AdministrateurService {


    public List<Administrateur> getAll();

    public  Administrateur getById(Integer id);

    public  Administrateur save( Administrateur administrateur);

    public List< Administrateur> saveAll(List< Administrateur> administrateurs);

    public void delete( Administrateur administrateur);

    public void deleteAll();

}
