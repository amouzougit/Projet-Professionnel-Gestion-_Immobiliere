package microservice.bien.serviceImpl.Gestion_Achat_Location;

import microservice.bien.dao.Gestion_Achat_Location.OperationDao;
import microservice.bien.model.Gestion_Achat_Location.Operation;
import microservice.bien.service.Gestion_Achat_Location.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("operationService")
public class OperationServiceImpl implements OperationService {

	@Autowired
	//@Qualifier(value ="operationDao")
	private OperationDao operationDao;

	@Override
	public List<Operation> getAll() {
		return this.operationDao.findAll();
	}

	@Override
	public Operation getById(Integer id) {
		return this.operationDao.getOne(id);
	}

	@Override
	public Operation save(Operation operation) {
		return this.operationDao.save(operation);
	}

	@Override
	public List<Operation> saveAll(List<Operation> operation) {
		return this.operationDao.saveAll(operation);
	}

	@Override
	public void delete(Operation operation) {
		this.operationDao.delete(operation);

	}

	@Override
	public void deleteAll() {
		this.operationDao.deleteAll();

	}
}
