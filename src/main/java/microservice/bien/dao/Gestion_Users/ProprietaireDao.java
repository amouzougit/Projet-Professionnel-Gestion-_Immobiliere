package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("proprietaireDao")
public interface ProprietaireDao extends JpaRepository<Proprietaire,Integer> {
}
