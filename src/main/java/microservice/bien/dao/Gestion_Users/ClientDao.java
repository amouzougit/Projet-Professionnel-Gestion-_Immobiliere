package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("clientDao")
public interface ClientDao extends JpaRepository<Client,Integer> {
}
