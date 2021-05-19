package microservice.bien.service.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Document_Operation;

import java.util.List;

import microservice.bien.model.Gestion_Achat_Location.Transaction;
import org.springframework.stereotype.Service;
@Service("transactionService")
public interface TransactionService {


    public List<Transaction> getAll();

    public Transaction getById(Integer id);

    public Transaction save(Transaction transaction);

    public List<Transaction> saveAll(List<Transaction>transactions);

    public  void delete(Transaction transaction);

    public void deleteAll();
















}
