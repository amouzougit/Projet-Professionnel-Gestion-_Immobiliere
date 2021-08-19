package microservice.bien.dao.Gestion_Immobilier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.bien.model.Gestion_Immobilier.TypeDocument;

@Repository("typeDocumentDao")
public interface TypeDocumentDao  extends JpaRepository<TypeDocument, Integer>{
	

}
