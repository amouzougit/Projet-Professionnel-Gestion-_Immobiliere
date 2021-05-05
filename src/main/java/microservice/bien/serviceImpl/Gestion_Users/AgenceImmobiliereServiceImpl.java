package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.AgenceImmobiliereDao;
import microservice.bien.model.Gestion_Users.AgenceImmobiliere;
import microservice.bien.service.Gestion_Users.AgenceImmobiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ageneImmobiliereService")
public class AgenceImmobiliereServiceImpl implements AgenceImmobiliereService {
		@Autowired
		@Qualifier(value="aagence_ImmobiliereDao")
		private AgenceImmobiliereDao agenceImmobiliereDao;

	@Override
	public List<AgenceImmobiliere> getAll() {
		return this.agenceImmobiliereDao.findAll();
	}

	@Override
	public AgenceImmobiliere getById(Integer id) {
		return this.agenceImmobiliereDao.getOne(id);
	}

	@Override
	public AgenceImmobiliere save(AgenceImmobiliere agenceImmobiliere) {
		return this.agenceImmobiliereDao.save(agenceImmobiliere);
	}

	@Override
	public List<AgenceImmobiliere> saveAll(List<AgenceImmobiliere> agenceImmobilieres) {
		return this.agenceImmobiliereDao.saveAll(agenceImmobilieres);
	}

	@Override
	public void delete(AgenceImmobiliere agenceImmobiliere) {
		this.agenceImmobiliereDao.delete((agenceImmobiliere));

	}

	@Override
	public void deleteAll() {
		this.agenceImmobiliereDao.deleteAll();

	}
}
