package microservice.bien.dao.Gestion_Users;

import microservice.bien.model.Gestion_Users.AgenceImmobiliere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("agenceimmobiliereDao")
public interface AgenceImmobiliereDao extends JpaRepository <AgenceImmobiliere,Integer>{
}
