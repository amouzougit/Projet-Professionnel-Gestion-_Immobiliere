package microservice.bien.service.Gestion_Immobilier;

import java.util.List;

import org.springframework.stereotype.Service;

import microservice.bien.model.Gestion_Immobilier.TypeDocument;

@Service("typedocumentService")
public interface TypeDocumentService {
	
	    public List<TypeDocument> getAll();

	    public TypeDocument getById(Integer id);

	    public TypeDocument save(TypeDocument typedocument);

	    public List<TypeDocument> saveAll(List<TypeDocument> typedocuments);

	    public void delete(TypeDocument typedocument);

	    public void deleteAll();

}
