package microservice.bien.dao.Gestion_publication;

import microservice.bien.model.Gestion_publication.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("publicationDao")
public interface PublicationDao extends JpaRepository<Publication,Integer> {
}
