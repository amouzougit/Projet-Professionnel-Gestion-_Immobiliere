package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.dao.Gestion_Users.NotaireDao;
import microservice.bien.model.Gestion_Users.Notaire;
import microservice.bien.service.Gestion_Users.NotaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.List;
@Service("notaireService")
public class NotaireServiceImpl implements NotaireService {
	@Autowired
	//@Qualifier(value="notaireDao")
	private NotaireDao notaireDao;

	@Override
	public List<Notaire> getAll() {
		return this.notaireDao.findAll();
	}

	@Override
	public Notaire getById(Integer id) {
		return this.notaireDao.getOne(id);
	}

	@Override
	public Notaire save(Notaire notaire) {
		return this.notaireDao.save(notaire);
	}

	@Override
	public List<Notaire> saveAll(List<Notaire> notaires) {
		return this.notaireDao.saveAll(notaires);
	}

	@Override
	public void delete(Notaire notaire) {
		this.notaireDao.delete(notaire);

	}

	@Override
	public void deleteAll() {
		this.notaireDao.deleteAll();

	}
}
