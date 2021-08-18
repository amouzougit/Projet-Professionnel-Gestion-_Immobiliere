package microservice.bien.serviceImpl.Gestion_Immobilier;

import microservice.bien.dao.Gestion_Immobilier.Document_BienDao;
import microservice.bien.model.Gestion_Immobilier.Bien;
import microservice.bien.model.Gestion_Immobilier.Document_Bien;
import microservice.bien.service.Gestion_Immobilier.Document_BienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("document_bienService")
public class Document_BienServiceImpl implements Document_BienService {

	@Autowired
	//@Qualifier(value="document_bienDao")
	private Document_BienDao document_bienDao;

	public List<Document_Bien> listDocumentBien() {
		return this.document_bienDao.findAll();
	}


	@Override
	public Document_Bien getById(Integer id) {
		return this.document_bienDao.getOne(id);
	}

	@Override
	public Document_Bien getDocument_bien(Document_Bien document_bien) {
		return this.document_bienDao.save(document_bien);
	}

	@Override
	public List<Document_Bien> saveAll(List<Document_Bien> document_biens) {
		return this.document_bienDao.saveAll(document_biens);
	}

	@Override
	public void delete(Document_Bien document_bien) {
		this.document_bienDao.delete(document_bien);
	}

	@Override
	public void deleteAll() {
		this.document_bienDao.deleteAll();

	}


	@Override
	public Document_Bien save(Document_Bien document_bien) {
		return this.document_bienDao.save(document_bien);	}
}
