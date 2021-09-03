package microservice.bien.serviceImpl.Gestion_publication;

import microservice.bien.dao.Gestion_publication.PublicationDao;
import microservice.bien.model.Gestion_Immobilier.Type_Bien;
import microservice.bien.model.Gestion_publication.Publication;
import microservice.bien.model.Gestion_publication.Type_Publication;
import microservice.bien.service.Gestion_publication.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
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
	public Publication getById(Long id) {
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

	@Override
	public List<Publication> publicationActive() {
		return this.publicationDao.publicationActive();
	}

	@Override
	public List<Publication> getLastPublication() {
		return this.publicationDao.getLastPublication(PageRequest.of(0,6));
	}




//	@Override
//	public List<Publication> findByTypePublication(Type_Publication typePublication) {
//		
//		return this.publicationDao.findByTypePublication(typePublication);
//	}
//
//	@Override
//	public List<Type_Bien> getByTypeBien(Type_Bien typeBien) {
//		return this.publicationDao.getByTypeBien(typeBien);
//	}



}
