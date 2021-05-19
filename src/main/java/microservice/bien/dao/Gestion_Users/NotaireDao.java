package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Notaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("notaireDao")
public interface NotaireDao extends JpaRepository<Notaire,Integer> {
}
