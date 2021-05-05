package microservice.bien.serviceImpl.Gestion_Users;

import microservice.bien.model.Gestion_Users.Notaire;
import microservice.bien.service.Gestion_Users.NotaireService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("notaireService")
import java.util.List;

public class NotaireServiceImpl implements NotaireService {

	@Override
	public List<Notaire> getAll() {
		return null;
	}

	@Override
	public Notaire getById(Integer id) {
		return null;
	}

	@Override
	public Notaire save(Notaire notaires) {
		return null;
	}

	@Override
	public List<Notaire> saveAll(List<Notaire> notaires) {
		return null;
	}

	@Override
	public void delete(Notaire notaire) {

	}

	@Override
	public void deleteAll() {

	}
}
