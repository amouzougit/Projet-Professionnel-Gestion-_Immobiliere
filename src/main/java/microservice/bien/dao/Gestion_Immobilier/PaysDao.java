package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("paysDao")
public interface PaysDao extends JpaRepository<Pays,Integer> {
}
