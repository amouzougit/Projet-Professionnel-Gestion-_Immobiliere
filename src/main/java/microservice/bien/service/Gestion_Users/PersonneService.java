package microservice.bien.service.Gestion_Users;

import microservice.bien.model.Gestion_Users.Personne;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("personneService")

public interface PersonneService {

    public List<Personne> getAll();

    public Personne getById(Long id);

    public Personne save(Personne personne);
    
	public Personne getByTelephone(String telephone);


    public List<Personne> saveAll(List<Personne> personnes);

    public void delete(Personne personnes);

    public void deleteAll();
    
    public Personne findByUsernameAndPassword(String username, String password);


}
