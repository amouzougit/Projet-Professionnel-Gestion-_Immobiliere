package microservice.bien.dao.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Mode_Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("mode_transactionDao")
public interface Mode_TransactionDao extends JpaRepository<Mode_Transaction,Integer> {
}
