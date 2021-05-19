package microservice.bien.serviceImpl.Gestion_publication;

import microservice.bien.dao.Gestion_publication.PublicationDao;
import microservice.bien.model.Gestion_publication.Publication;
import microservice.bien.service.Gestion_publication.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("publicationService")
public class PublicationServiceImpl implements PublicationService {
	@Autowired
	//@Qualifier(value ="publicationDao")
	private PublicationDao publicationDao;

	@Override
	public List<Publication> getAll() {
		return this.publicationDao.findAll();
	}

	@Override
	public Publication getById(Integer id) {
		return publicationDao.getOne(id);
	}

	@Override
	public Publication save(Publication publication) {
		return this.publicationDao.save(publication);
	}

	@Override
	public List<Publication> saveAll(List<Publication> publications) {
		return this.publicationDao.saveAll(publications);
	}

	@Override
	public void delete(Publication publication) {
		this.publicationDao.delete(publication);

	}

	@Override
	public void deleteAll() {
		this.publicationDao.deleteAll();

	}
}
