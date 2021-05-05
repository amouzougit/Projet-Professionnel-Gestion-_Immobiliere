package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.CabinetDao;
import microservice.bien.model.Gestion_Users.Cabinet;
import microservice.bien.service.Gestion_Users.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("cabinetService")
public class CabinetServiceImpl implements CabinetService {
	@Autowired
	@Qualifier(value="cabinetDao")
	private CabinetDao cabinetDao;


	public List<Cabinet> getAll() {
		return this.cabinetDao.findAll();
	}


	public Cabinet getById(Integer id) {
		return this.cabinetDao.getOne(id);
	}


	public Cabinet save(Cabinet cabinet) {
		return this.cabinetDao.save(cabinet);
	}


	public List<Cabinet> saveAll(List<Cabinet> cabinets) {
		return this.cabinetDao.saveAll(cabinets);
	}


	public void delete(Cabinet cabinet) {
		this.cabinetDao.delete(cabinet);

	}


	public void deleteAll() {
		this.cabinetDao.deleteAll();

	}
}
