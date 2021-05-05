package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Bien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BienDao extends JpaRepository <Bien, Long>{

}
