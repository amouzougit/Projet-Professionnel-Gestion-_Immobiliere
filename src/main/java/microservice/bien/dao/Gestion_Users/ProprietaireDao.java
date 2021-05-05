package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietaireDao extends JpaRepository<Proprietaire,Integer> {
}
