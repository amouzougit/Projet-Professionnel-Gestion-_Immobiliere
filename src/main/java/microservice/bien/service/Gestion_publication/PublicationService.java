package microservice.bien.service.Gestion_publication;


import microservice.bien.model.Gestion_publication.Publication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public interface PublicationService {

    public List<Publication> getAll();

    public Publication getById(Integer id);

    public Publication save(Publication publication);

    public List<Publication> saveAll(List<Publication> publications);

    public void delete(Publication publication);

    public void deleteAll();


}
