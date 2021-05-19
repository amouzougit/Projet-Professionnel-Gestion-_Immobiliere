package microservice.bien.service.Gestion_Achat_Location;

import microservice.bien.model.Gestion_Achat_Location.Document_Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("document_transactionService")
public interface Document_TransactionService {

	public List<Document_Transaction> getAll();

	public Document_Transaction getById(Integer id);
	
	public Document_Transaction save(Document_Transaction document_transaction);
	
	public List<Document_Transaction> saveAll(List<Document_Transaction> document_transactions);
	
	public void delete(Document_Transaction document_transaction);
	
	public void deleteAll();

}
