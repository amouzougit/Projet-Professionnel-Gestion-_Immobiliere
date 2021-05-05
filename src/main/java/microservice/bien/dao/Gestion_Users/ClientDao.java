package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client,Integer> {
}
