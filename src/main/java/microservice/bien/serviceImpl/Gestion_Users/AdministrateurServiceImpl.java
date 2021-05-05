package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.AdministrateurDao;
import microservice.bien.model.Gestion_Users.Administrateur;
import microservice.bien.service.Gestion_Users.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("administrateurService")
public class AdministrateurServiceImpl implements AdministrateurService {
	@Autowired
	@Qualifier(value="administrateurService")
	private AdministrateurDao administrateurDao;

	@Override
	public List<Administrateur> getAll() {
		return this.administrateurDao.findAll();
	}

	@Override
	public Administrateur getById(Integer id) {
		return this.administrateurDao.getOne(id);
	}

	@Override
	public Administrateur save(Administrateur administrateur) {
		return this.administrateurDao.save(administrateur);
	}

	@Override
	public List<Administrateur> saveAll(List<Administrateur> administrateurs) {
		return this.saveAll(administrateurs);
	}

	@Override
	public void delete(Administrateur administrateur) {
		this.administrateurDao.delete(administrateur);

	}

	@Override
	public void deleteAll() {
		this.administrateurDao.deleteAll();

	}
}
