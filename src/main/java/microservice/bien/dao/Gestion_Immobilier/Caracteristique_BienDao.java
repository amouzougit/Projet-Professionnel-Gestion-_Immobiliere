package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Caracteristique_Bien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Caracteristique_BienDao extends JpaRepository<Caracteristique_Bien,Integer> {
}
