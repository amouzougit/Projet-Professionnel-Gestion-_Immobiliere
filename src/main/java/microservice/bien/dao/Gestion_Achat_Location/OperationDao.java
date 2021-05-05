package microservice.bien.dao.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationDao extends JpaRepository<Operation,Integer> {
}
