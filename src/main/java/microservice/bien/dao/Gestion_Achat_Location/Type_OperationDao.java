package microservice.bien.dao.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Type_Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("type_operationDao")
public interface Type_OperationDao extends JpaRepository<Type_Operation,Integer> {
}
