package microservice.bien.service.Gestion_publication;

import microservice.bien.model.Gestion_publication.Type_Publication;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("type_publicationService")
public interface Type_PublicationService {


    public List<Type_Publication> getAll();

    public Type_Publication getById(Integer id);

    public Type_Publication save(Type_Publication type_publication);

    public List<Type_Publication> saveAll(List<Type_Publication> type_publications);

    public void delete(Type_Publication type_publication);

    public void deleteAll();


}
