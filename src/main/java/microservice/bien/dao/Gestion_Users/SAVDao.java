package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.SAV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("savDao")
public interface SAVDao extends JpaRepository<SAV,Integer> {
}
