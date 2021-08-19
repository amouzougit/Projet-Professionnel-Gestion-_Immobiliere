package microservice.bien.serviceImpl.Gestion_Immobilier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microservice.bien.dao.Gestion_Immobilier.TypeDocumentDao;
import microservice.bien.model.Gestion_Immobilier.TypeDocument;
import microservice.bien.service.Gestion_Immobilier.TypeDocumentService;

@Service
public class TypeDocumentServiceImpl implements TypeDocumentService {

	@Autowired
	//@Qualifier(value ="villeDao")
	private TypeDocumentDao typedocumentDao;


	@Override
	public List<TypeDocument> getAll() {
		return this.typedocumentDao.findAll();
	}

	@Override
	public TypeDocument getById(Integer id) {
		return this.typedocumentDao.getOne(id);
	}

	@Override
	public TypeDocument save(TypeDocument typedocument) {
		return this.typedocumentDao.save(typedocument);
	}

	@Override
	public List<TypeDocument> saveAll(List<TypeDocument> typedocuments) {
		return this.typedocumentDao.saveAll(typedocuments);
	}

	@Override
	public void delete(TypeDocument typedocument) {
		this.typedocumentDao.delete(typedocument);

	}

	@Override
	public void deleteAll() {
		this.typedocumentDao.deleteAll();

	}
}
