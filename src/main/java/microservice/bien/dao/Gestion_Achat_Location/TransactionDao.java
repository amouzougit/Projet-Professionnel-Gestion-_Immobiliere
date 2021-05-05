package microservice.bien.dao.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDao extends JpaRepository<Transaction,Integer> {
}
