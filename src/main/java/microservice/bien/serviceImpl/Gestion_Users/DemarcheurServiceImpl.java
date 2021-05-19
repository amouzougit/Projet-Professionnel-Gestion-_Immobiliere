package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.DemarcheurDao;
import microservice.bien.model.Gestion_Users.Demarcheur;
import microservice.bien.service.Gestion_Users.DemarcheurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("DemarcheurService")
public class DemarcheurServiceImpl implements DemarcheurService {

	@Autowired
	//@Qualifier(value="demarcheurDao")
	private DemarcheurDao demarcheurDao;
	@Override
	public List<Demarcheur> getAll() {
		return this.demarcheurDao.findAll();
	}

	@Override
	public Demarcheur getById(Integer id) {
		return this.demarcheurDao.getOne(id);
	}

	@Override
	public Demarcheur save(Demarcheur demarcheur) {
		return this.demarcheurDao.save(demarcheur);
	}

	@Override
	public List<Demarcheur> saveAll(List<Demarcheur> demarcheurs) {
		return this.demarcheurDao.saveAll(demarcheurs);
	}

	@Override
	public void delete(Demarcheur demarcheur) {
		this.demarcheurDao.delete(demarcheur);

	}

	@Override
	public void deleteAll() {
		this.demarcheurDao.deleteAll();

	}



}
