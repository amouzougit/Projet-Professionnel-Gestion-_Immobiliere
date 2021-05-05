package microservice.bien.serviceImpl.Gestion_publication;

import microservice.bien.dao.Gestion_publication.Type_PublicationDao;
import microservice.bien.model.Gestion_publication.Type_Publication;
import microservice.bien.service.Gestion_publication.Type_PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("type_publicationService")
public class Type_PublicationServiceImpl implements Type_PublicationService {

	@Autowired
	@Qualifier(value ="type_publicationDao")
	private Type_PublicationDao type_publicationDao;

	@Override
	public List<Type_Publication> getAll() {
		return this.type_publicationDao.findAll();
	}

	@Override
	public Type_Publication getById(Integer id) {
		return this.type_publicationDao.getOne(id);
	}

	@Override
	public Type_Publication save(Type_Publication type_publication) {
		return this.type_publicationDao.save(type_publication);
	}

	@Override
	public List<Type_Publication> saveAll(List<Type_Publication> type_publications) {
		return this.type_publicationDao.saveAll(type_publications);
	}

	@Override
	public void delete(Type_Publication type_publication) {
		this.type_publicationDao.delete(type_publication);

	}

	@Override
	public void deleteAll() {
		this.type_publicationDao.deleteAll();

	}
}
