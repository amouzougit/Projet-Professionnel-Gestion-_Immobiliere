package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Notaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaireDao extends JpaRepository<Notaire,Integer> {
}
