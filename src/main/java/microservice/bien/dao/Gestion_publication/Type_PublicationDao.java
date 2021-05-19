package microservice.bien.dao.Gestion_publication;

import microservice.bien.model.Gestion_publication.Type_Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("type_publicationDao")
public interface Type_PublicationDao extends JpaRepository<Type_Publication,Integer> {
}
