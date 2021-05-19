package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("cabinetDao")
public interface CabinetDao extends JpaRepository<Cabinet,Integer> {
}
