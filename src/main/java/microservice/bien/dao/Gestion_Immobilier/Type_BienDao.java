package microservice.bien.dao.Gestion_Immobilier;

import microservice.bien.model.Gestion_Immobilier.Type_Bien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("type_bienDao")

public interface Type_BienDao extends JpaRepository<Type_Bien,Integer> {
}
