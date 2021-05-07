package microservice.bien.dao.Gestion_publication;

import microservice.bien.model.Gestion_publication.Type_Publication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Type_PublicationDao extends JpaRepository<Type_Publication,Integer> {
}
