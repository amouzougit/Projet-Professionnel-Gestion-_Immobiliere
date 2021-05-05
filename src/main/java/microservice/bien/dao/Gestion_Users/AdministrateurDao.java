package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministrateurDao extends JpaRepository<Administrateur,Integer> {

}
