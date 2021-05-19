package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("administrateurDao")
public interface AdministrateurDao extends JpaRepository<Administrateur,Integer> {

}
