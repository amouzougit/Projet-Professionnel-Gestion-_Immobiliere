package microservice.bien.serviceImpl.Gestion_Immobilier;

import microservice.bien.dao.Gestion_Achat_Location.Type_OperationDao;
import microservice.bien.dao.Gestion_Immobilier.Type_BienDao;
import microservice.bien.model.Gestion_Achat_Location.Type_Operation;
import microservice.bien.model.Gestion_Immobilier.Type_Bien;
import microservice.bien.service.Gestion_Achat_Location.Type_OperationService;
import microservice.bien.service.Gestion_Immobilier.Type_BienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("type_bienService")
public class Type_BienServiceImpl implements Type_BienService {

	@Autowired
	//@Qualifier(value ="type_bienDao")
	private Type_BienDao type_bienDao;

	@Override
	public List<Type_Bien> getAll() {
		return this.type_bienDao.findAll();
	}

	@Override
	public Type_Bien getById(Integer id) {
		return this.type_bienDao.getOne(id);
	}

	@Override
	public Type_Bien save(Type_Bien type_bien) {
		return this.type_bienDao.save(type_bien);
	}

	@Override
	public List<Type_Bien> saveAll(List<Type_Bien> type_biens) {
		return this.type_bienDao.saveAll(type_biens);
	}

	@Override
	public void delete(Type_Bien type_bien) {
		this.type_bienDao.delete(type_bien);


	}

	@Override
	public void deleteAll() {
		this.type_bienDao.deleteAll();

	}
}
