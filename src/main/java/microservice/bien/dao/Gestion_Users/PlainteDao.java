package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Plainte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlainteDao extends JpaRepository<Plainte,Integer> {
}
