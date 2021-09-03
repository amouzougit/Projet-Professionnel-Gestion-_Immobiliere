package microservice.bien.service.Gestion_publication;
import microservice.bien.model.Gestion_Immobilier.Type_Bien;
import microservice.bien.model.Gestion_publication.Publication;
import microservice.bien.model.Gestion_publication.Type_Publication;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "publicationService")
public interface PublicationService {

    public List<Publication> getAll();

    public Publication getById(Long id);

    public Publication save(Publication publication);

    public List<Publication> saveAll(List<Publication> publications);

    public void delete(Publication publication);

    public void deleteAll();
    
//    public List<Publication> findByTypePublication(Type_Publication typePublication);
// 
//    public List<Type_Bien> getByTypeBien(Type_Bien typeBien);
    
		//public List<Publication> lastSixPublications (Integer number, Pageable pageable);
    
   
    public List<Publication> publicationActive();
	
    
    public List<Publication> getLastPublication();
	



}
