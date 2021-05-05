package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabinetDao extends JpaRepository<Cabinet,Integer> {
}
