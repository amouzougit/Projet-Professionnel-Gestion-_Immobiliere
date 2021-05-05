package microservice.bien.serviceImpl.Gestion_Achat_Location;

import microservice.bien.dao.Gestion_Achat_Location.Document_TransactionDao;
import microservice.bien.model.Gestion_Achat_Location.Document_Transaction;
import microservice.bien.service.Gestion_Achat_Location.Document_TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("document_transactionService")
public class Document_TransactionServiceImpl implements Document_TransactionService {
	@Autowired
	@Qualifier(value="document_transactionDao")
	private Document_TransactionDao document_TransactionDao;


	public List<Document_Transaction> getAll() {
		return this.document_TransactionDao.findAll();
	}


	public Document_Transaction getById(Integer id) {
		return this.document_TransactionDao.getOne(id);
	}


	public Document_Transaction save(Document_Transaction document_transaction) {
		return this.document_TransactionDao.save(document_transaction);
	}


	public List<Document_Transaction> saveAll(List<Document_Transaction> document_transactions) {
		return this.document_TransactionDao.saveAll(document_transactions);
	}


	public void delete(Document_Transaction document_transaction) {
		this.document_TransactionDao.delete(document_transaction);

	}


	public void deleteAll() {
		this.document_TransactionDao.deleteAll();

	}
}
