package microservice.bien.service.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Mode_Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mode_transactionService")
public interface Mode_TransactionService {

    public List<Mode_Transaction> getAll();
    public Mode_Transaction getById(Integer id);
    public Mode_Transaction save(Mode_Transaction mode_transaction);
    public List<Mode_Transaction> saveAll(List<Mode_Transaction> mode_transactions);
    public void delete(Mode_Transaction mode_transaction);
    public void deleteAll();


}
