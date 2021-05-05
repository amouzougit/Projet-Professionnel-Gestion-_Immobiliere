package microservice.bien.serviceImpl.Gestion_Immobilier;

import microservice.bien.dao.Gestion_Immobilier.PaysDao;
import microservice.bien.model.Gestion_Immobilier.Pays;
import microservice.bien.service.Gestion_Immobilier.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("paysService")
public class PaysServiceImpl  implements PaysService {

	@Autowired
	@Qualifier(value="paysDao")
	private PaysDao paysDao;
	@Override
	public List<Pays> getAll() {
		return this.paysDao.findAll();

	}

	@Override
	public Pays getById(Integer id) {
		return this.paysDao.getOne(id);
	}

	@Override
	public Pays save(Pays pays) {
		return this.paysDao.save(pays);
	}

	@Override
	public List<Pays> saveAll(List<Pays> pays) {
		return this.paysDao.saveAll(pays);
	}

	@Override
	public void delete(Pays pays) {
		this.paysDao.delete(pays);

	}

	@Override
	public void deleteAll() {
		this.paysDao.deleteAll();

	}
}
