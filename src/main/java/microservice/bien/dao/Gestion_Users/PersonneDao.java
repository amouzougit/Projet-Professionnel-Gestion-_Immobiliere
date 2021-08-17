package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("personneDao")
public interface PersonneDao extends JpaRepository<Personne, Long> {
	
	Personne findByUsernameAndPassword(String username, String password);
	
	Personne findByTelephone(String telephone);

}
