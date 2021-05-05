package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneDao extends JpaRepository<Personne, Long> {
}
