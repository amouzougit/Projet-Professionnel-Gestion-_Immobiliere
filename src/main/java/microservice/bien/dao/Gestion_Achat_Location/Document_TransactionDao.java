package microservice.bien.dao.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Document_Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Document_TransactionDao extends JpaRepository<Document_Transaction,Integer> {
}
