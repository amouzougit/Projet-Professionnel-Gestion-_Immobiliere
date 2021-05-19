package microservice.bien.serviceImpl.Gestion_Immobilier;

import microservice.bien.dao.Gestion_Immobilier.VilleDao;
import microservice.bien.model.Gestion_Immobilier.Ville;
import microservice.bien.service.Gestion_Immobilier.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VilleServiceImpl implements VilleService {
	@Autowired
	//@Qualifier(value ="villeDao")
	private VilleDao villeDao;


	@Override
	public List<Ville> getAll() {
		return this.villeDao.findAll();
	}

	@Override
	public Ville getById(Integer id) {
		return this.villeDao.getOne(id);
	}

	@Override
	public Ville save(Ville ville) {
		return this.villeDao.save(ville);
	}

	@Override
	public List<Ville> saveAll(List<Ville> villes) {
		return this.villeDao.saveAll(villes);
	}

	@Override
	public void delete(Ville ville) {
		this.villeDao.delete(ville);

	}

	@Override
	public void deleteAll() {
		this.villeDao.deleteAll();

	}
}
