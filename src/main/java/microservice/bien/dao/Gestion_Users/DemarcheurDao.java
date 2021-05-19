package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.Demarcheur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("demarcheurDao")
public interface DemarcheurDao extends JpaRepository<Demarcheur,Integer> {
}
