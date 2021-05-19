package microservice.bien.serviceImpl.Gestion_Achat_Location;

import microservice.bien.dao.Gestion_Achat_Location.TransactionDao;
import microservice.bien.model.Gestion_Achat_Location.Document_Operation;
import microservice.bien.model.Gestion_Achat_Location.Transaction;
import microservice.bien.service.Gestion_Achat_Location.TransactionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service("transactionService")
public class TransactionServiceImpl implements TransactionService {


	@Autowired
	//@Qualifier(value ="transactionDao")
	private TransactionDao transactionDao;

	public List<Transaction> getAll()
	{
		return this.transactionDao.findAll();
	}

	@Override
	public Transaction getById(Integer id)
	{
		return this.transactionDao.getOne(id);
	}

	@Override
	public Transaction save(Transaction transaction)
	{
		return this.transactionDao.save(transaction);
	}

	@Override
	public List<Transaction> saveAll(List<Transaction> transactions)
	{
		return this.transactionDao.saveAll(transactions);
	}

	@Override
	public void delete(Transaction transaction) {
		this.transactionDao.delete(transaction);

	}

	@Override
	public void deleteAll() {
		this.transactionDao.deleteAll();

	}
}
