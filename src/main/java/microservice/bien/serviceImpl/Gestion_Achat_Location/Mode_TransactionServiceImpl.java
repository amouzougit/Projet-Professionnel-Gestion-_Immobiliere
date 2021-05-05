package microservice.bien.serviceImpl.Gestion_Achat_Location;

import microservice.bien.dao.Gestion_Achat_Location.Mode_TransactionDao;
import microservice.bien.model.Gestion_Achat_Location.Mode_Transaction;
import microservice.bien.model.Gestion_Immobilier.Quartier;
import microservice.bien.service.Gestion_Achat_Location.Mode_TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mode_transactionService")
public class Mode_TransactionServiceImpl implements Mode_TransactionService {
	@Autowired
	@Qualifier(value="mode_transactionDao")
	private Mode_TransactionDao mode_transactionDao;

	@Override
	public List<Mode_Transaction> getAll() {
		return this.mode_transactionDao.findAll();
	}

	@Override
	public Mode_Transaction getById(Integer id) {
		return this.mode_transactionDao.getOne(id);

	}

	@Override
	public Mode_Transaction save(Mode_Transaction mode_transaction) {
		return this.mode_transactionDao.save(mode_transaction);
	}

	@Override
	public List<Mode_Transaction> saveAll(List<Mode_Transaction> mode_transactions) {
		return null;
	}

	@Override
	public void delete(Mode_Transaction mode_transaction) {
		this.mode_transactionDao.delete(mode_transaction);

	}

	@Override
	public void deleteAll() {
		this.mode_transactionDao.deleteAll();


	}
}
