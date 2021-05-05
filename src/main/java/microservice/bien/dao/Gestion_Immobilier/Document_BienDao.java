package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Document_Bien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Document_BienDao extends JpaRepository<Document_Bien,Integer> {
}
