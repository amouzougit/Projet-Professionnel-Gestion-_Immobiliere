package microservice.bien.dao.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Document_Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("document_operationDao")
public interface Document_OperationDao extends JpaRepository<Document_Operation,Integer> {
}
