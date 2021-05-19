package microservice.bien.serviceImpl.Gestion_Achat_Location;

import microservice.bien.dao.Gestion_Achat_Location.Type_OperationDao;
import microservice.bien.model.Gestion_Achat_Location.Type_Operation;
import microservice.bien.service.Gestion_Achat_Location.Type_OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("type_operationService")
public class Type_OperationServiceImpl implements Type_OperationService {

	@Autowired
	//@Qualifier(value ="type_operationDao")
	private Type_OperationDao type_operationDao;

	@Override
	public List<Type_Operation> getAll() {
		return this.type_operationDao.findAll();
	}

	@Override
	public Type_Operation getById(Integer id) {
		return this.type_operationDao.getOne(id);
	}

	@Override
	public Type_Operation save(Type_Operation type_operation) {
		return this.type_operationDao.save(type_operation);
	}

	@Override
	public List<Type_Operation> saveAll(List<Type_Operation> type_operations) {
		return this.type_operationDao.saveAll(type_operations);
	}

	@Override
	public void delete(Type_Operation type_operation) {
		this.type_operationDao.delete(type_operation);

	}

	@Override
	public void deleteAll() {
		this.type_operationDao.deleteAll();


	}
}
