package microservice.bien.serviceImpl.Gestion_Immobilier;

import microservice.bien.dao.Gestion_Immobilier.QuartierDao;
import microservice.bien.model.Gestion_Immobilier.Quartier;
import microservice.bien.service.Gestion_Immobilier.QuartierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class QuartierServiceImpl implements QuartierService {
	@Autowired
	@Qualifier(value ="quartierDao")
	private QuartierDao quartierDao;


	@Override
	public List<Quartier> getAll() {
		return this.quartierDao.findAll();
	}

	@Override
	public Quartier getById(Integer id) {
		return this.quartierDao.getOne(id);

	}

	@Override
	public Quartier save(Quartier quartier) {
		return this.quartierDao.save(quartier);
	}

	@Override
	public List<Quartier> saveAll(List<Quartier> quartiers) {
		return this.quartierDao.saveAll(quartiers);
	}

	@Override
	public void delete(Quartier quartier) {
		this.quartierDao.delete(quartier);

	}

	@Override
	public void deleteAll() {
		this.quartierDao.deleteAll();

	}
}
