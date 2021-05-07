package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Proprietaire;
import microservice.bien.model.Gestion_Users.SAV;
import org.springframework.stereotype.Service;

import java.util.List;
@Service()
public interface SAVService {

    public List<SAV> getAll();

    public SAV getById(Integer id);

    public SAV save(SAV  sav);

    public List<SAV> saveAll(List<SAV> savs);

    public void delete(SAV sav);

    public void deleteAll();


}
