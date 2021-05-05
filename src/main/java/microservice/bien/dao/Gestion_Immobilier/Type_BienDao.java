package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Type_Bien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Type_BienDao extends JpaRepository<Type_Bien,Integer> {
}
