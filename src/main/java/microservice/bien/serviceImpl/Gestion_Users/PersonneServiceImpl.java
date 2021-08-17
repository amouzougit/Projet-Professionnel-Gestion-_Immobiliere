package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.PersonneDao;
import microservice.bien.model.Gestion_Users.Personne;
import microservice.bien.service.Gestion_Users.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("personneService")
public class PersonneServiceImpl implements PersonneService {

    @Autowired
    //@Qualifier(value="personneDao")
    private PersonneDao personneDao;

    @Override
    public List<Personne> getAll() {
        return this.personneDao.findAll();
    }

    @Override
    public Personne getById(Long id) {
        return this.personneDao.getOne(id);
    }

    @Override
    public Personne save(Personne personne) {
        return this.personneDao.save(personne);
    }

    @Override
    public List<Personne> saveAll(List<Personne> personnes) {
        return this.personneDao.saveAll(personnes);
    }

    @Override
    public void delete(Personne personne) {
        this.personneDao.delete(personne);

    }

    @Override
    public void deleteAll() {
        this.personneDao.deleteAll();

    }
    
    public Personne findByUsernameAndPassword(String username, String password) {
 	   
 	   return this.personneDao.findByUsernameAndPassword(username, password);
    }
    
    @Override
	public Personne getByTelephone(String telephone) {
		
		 return this.personneDao.findByTelephone(telephone);
	}
}
